package cwowhappy.study.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    private String appName;

    @RequestMapping("/app/name")
    public String getAppName() {
        return appName;
    }

    @Value("${spring.application.name}")
    public void setAppName(String appName) {
        this.appName = appName;
    }
}
