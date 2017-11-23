package cwowhappy.study.spring.cloud.controller;

import cwowhappy.study.spring.cloud.service.GreetProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    private GreetProxyService greetProxyService;

    @RequestMapping("/greet")
    public String greet() {
        return greetProxyService.greetFromClient();
    }

    @Autowired
    public void setGreetProxyService(GreetProxyService greetProxyService) {
        this.greetProxyService = greetProxyService;
    }
}
