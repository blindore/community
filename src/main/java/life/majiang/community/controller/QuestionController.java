package life.majiang.community.controller;

import life.majiang.community.dto.CommentDTO;
import life.majiang.community.dto.QuestionDTO;
import life.majiang.community.enums.CommentTypeEnum;
import life.majiang.community.service.CommentService;
import life.majiang.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author:吴玉魁
 * @date:2019/10/11_16:21
 */
@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @Autowired
    private CommentService commentService;
    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Integer id,
                           Model model){
       QuestionDTO questionDTO = questionService.getById(id);
       List<QuestionDTO> relatedQuestions = questionService.selectRelated(questionDTO);
       List<CommentDTO> comments = commentService.listByTargetId(id, CommentTypeEnum.QUESTION);
       questionService.incView(id);//增加阅读功能
       model.addAttribute("question", questionDTO) ;
       model.addAttribute("comments", comments) ;
       model.addAttribute("relatedQuestions", relatedQuestions) ;
       return "question";
    }
}
