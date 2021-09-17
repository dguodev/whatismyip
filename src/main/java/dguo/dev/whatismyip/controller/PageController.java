package dguo.dev.whatismyip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

    @RequestMapping("/whatismyip")
    public String home(HttpServletRequest request, Model model) {

        model.addAttribute("ip", request.getRemoteAddr());

        return "index.html";
    }
}
