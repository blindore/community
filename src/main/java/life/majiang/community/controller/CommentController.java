package life.majiang.community.controller;

import life.majiang.community.dto.CommenCreatetDTO;
import life.majiang.community.dto.ResultDTO;
import life.majiang.community.exception.CustomizeErrorCode;
import life.majiang.community.model.Comment;
import life.majiang.community.model.User;
import life.majiang.community.service.CommentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author:吴玉魁
 * @date:2019/10/15_15:05
 */
@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;
    @ResponseBody
    @RequestMapping(value = "/comment",method = RequestMethod.POST)
    public Object post(@RequestBody CommenCreatetDTO commenCreatetDTO,
                        HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        if (user ==null){
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }

    if (commenCreatetDTO ==null || StringUtils.isBlank(commenCreatetDTO.getContent())) {
            return ResultDTO.errorOf(CustomizeErrorCode.CONTENT_IS_EMPTY);
        }

        Comment comment = new Comment();
        comment.setParentId(commenCreatetDTO.getParentId());
        comment.setContent(commenCreatetDTO.getContent());
        comment.setType(commenCreatetDTO.getType());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setCommentator(user.getId());
        comment.setLikeCount(0);
        commentService.insert(comment);
        return ResultDTO.okOf();
        

    }
}
