package cwowhappy.study.spring.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetProxyService {
    private RestTemplate restTemplate;

    private String service01Name;

    @HystrixCommand(fallbackMethod = "greetError")
    public String greetFromService() {
        return restTemplate.getForObject(String.format("http://%s/greet", service01Name), String.class);
    }

    public String greetError() {
        return "error";
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${services.service-01.name}")
    public void setService01Name(String service01Name) {
        this.service01Name = service01Name;
    }
}
