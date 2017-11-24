package cwowhappy.study.spring.cloud.controller;

import cwowhappy.study.spring.cloud.respbody.GreetRespBody;
import cwowhappy.study.spring.cloud.respbody.RootRespBody;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class GreetController {
    private String appName;
    private String appPort;

    @RequestMapping("/greet")
    public RootRespBody<GreetRespBody> greet() {
        GreetRespBody greetRespBody = new GreetRespBody();
        greetRespBody.setAppName(appName + ":" + appPort);
        greetRespBody.setTimestamp(LocalDateTime.now());
        return RootRespBody.build(RootRespBody.Status.SUCCESS, "success", greetRespBody);
    }

    @Value("${spring.application.name}")
    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Value("${server.port}")
    public void setAppPort(String appPort) {
        this.appPort = appPort;
    }
}
