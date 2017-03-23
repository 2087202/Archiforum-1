package ArchiForum.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tmo on 8-3-2017.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping()
    public ModelAndView home() {
        return new ModelAndView("common/welcome",null);
    }

    @RequestMapping("/login")
    public String login() {
        return "views/common/login";
    }
}
