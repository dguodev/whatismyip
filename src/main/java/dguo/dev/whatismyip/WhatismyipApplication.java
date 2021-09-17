package dguo.dev.whatismyip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@SpringBootApplication
public class WhatismyipApplication {

    @RequestMapping("/whatis")
    public String home(HttpServletRequest request) {
        return "Your IP :" + request.getRemoteAddr();
    }

    public static void main(String[] args) {
        SpringApplication.run(WhatismyipApplication.class, args);
    }

}
