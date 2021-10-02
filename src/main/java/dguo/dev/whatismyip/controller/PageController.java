package dguo.dev.whatismyip.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

    Logger logger = LoggerFactory.getLogger(PageController.class);

    @RequestMapping("/whatismyip")
    public String home(HttpServletRequest request, Model model, @RequestHeader("x-forwarded-for") String sourceIP) {

        String ip = request.getRemoteAddr();

        logger.info("RemoteAddr {}",ip);

        if (!StringUtils.isEmpty(sourceIP)) {

            logger.info("x-forwarded-for captured {}",sourceIP);

            ip = sourceIP;
        }



        model.addAttribute("ip", ip);

        return "index.html";
    }


}
