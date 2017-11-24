package cwowhappy.study.spring.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetProxyService {
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "greetError")
    public String greetFromService() {
        return restTemplate.getForObject("http://APPNAME-01/greet", String.class);
    }

    public String greetError() {
        return "error";
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
