package cwowhappy.study.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "APPNAME-01")
public interface GreetProxyService {
    @RequestMapping("/greet")
    String greetFromClient();
}
