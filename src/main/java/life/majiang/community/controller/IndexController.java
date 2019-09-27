package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author:吴玉魁
 * @date:2019/9/27_15:41
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
