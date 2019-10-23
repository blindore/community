package life.majiang.community.controller;

import life.majiang.community.dto.PaginationDTO;
import life.majiang.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author:吴玉魁
 * @date:2019/9/27_15:41
 */
@Controller
public class IndexController {
    @Autowired
    private QuestionService questionService;
    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page",defaultValue = "1") Integer page,
                        @RequestParam(name = "size",defaultValue = "6") Integer size,
                        @RequestParam(name = "search",required = false) String search
                        ){
        PaginationDTO pagination =questionService.list(search, page, size);
        model.addAttribute("pagination",pagination);
        model.addAttribute("search",search);

        return "index";
    }

}
