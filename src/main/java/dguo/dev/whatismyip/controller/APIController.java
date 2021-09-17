package dguo.dev.whatismyip.controller;

import dguo.dev.whatismyip.entity.IP;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
public class APIController {

    @RequestMapping("/api/whatismyip")
    public IP home(HttpServletRequest request) {

        IP ip = new IP();
        ip.setIP(request.getRemoteAddr());
        ip.setTimestamp(new Date());

        return ip;
    }

}
