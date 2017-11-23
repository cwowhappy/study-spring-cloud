package cwowhappy.study.springboot.controller;

import cwowhappy.study.springboot.respbody.GreetRespBody;
import cwowhappy.study.springboot.respbody.RootRespBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class GreetController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetController.class);

    @RequestMapping("/greet")
    public RootRespBody<GreetRespBody> greet() {
        GreetRespBody greetRespBody = new GreetRespBody();
        greetRespBody.setTimestamp(LocalDateTime.now());
        return RootRespBody.build(RootRespBody.Status.SUCCESS, "success", greetRespBody);
    }
}
