package cwowhappy.study.spring.cloud.controller;

import cwowhappy.study.spring.cloud.respbody.GreetRespBody;
import cwowhappy.study.spring.cloud.respbody.RootRespBody;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ConfigController {
    private String appName;

    @RequestMapping("/greet")
    public RootRespBody<GreetRespBody> greet() {
        GreetRespBody greetRespBody = new GreetRespBody();
        greetRespBody.setAppName(appName);
        greetRespBody.setTimestamp(LocalDateTime.now());
        return RootRespBody.build(RootRespBody.Status.SUCCESS, "SUCCESS", greetRespBody);
    }

    @Value("${dev.spring.application.name}")
    public void setAppName(String appName) {
        this.appName = appName;
    }
}
