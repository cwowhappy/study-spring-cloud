package cwowhappy.study.spring.cloud.respbody;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class GreetRespBody {
    private String appName;
    private LocalDateTime timestamp;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
