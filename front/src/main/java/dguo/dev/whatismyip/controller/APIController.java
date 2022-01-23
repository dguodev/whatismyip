package dguo.dev.whatismyip.controller;

import dguo.dev.whatismyip.entity.IP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

@RestController
public class APIController {

    Logger logger = LoggerFactory.getLogger(APIController.class);

    @RequestMapping("/api/whatismyip")
    public IP home(HttpServletRequest request, @RequestHeader("x-forwarded-for") String sourceIP) {


        String ip = request.getRemoteAddr();

        logger.info("RemoteAddr {}", ip);

        if (!StringUtils.isEmpty(sourceIP)) {

            logger.info("x-forwarded-for captured {}", sourceIP);

            ip = sourceIP;
        }


        return new IP(ip, new Date());

    }

    @GetMapping("/api/listHeaders")
    public Map<String, String> listAllHeaders(
            @RequestHeader Map<String, String> headers) {

        headers.forEach((key, value) -> logger.info(String.format("Header '%s' = %s", key, value)));

        return headers;
    }
}
