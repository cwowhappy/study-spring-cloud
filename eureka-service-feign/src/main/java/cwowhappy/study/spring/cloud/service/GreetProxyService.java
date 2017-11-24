package cwowhappy.study.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "${services.service-01.name}")
public interface GreetProxyService {
    @RequestMapping("/greet")
    String greetFromClient();
}
