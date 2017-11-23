package cwowhappy.study.springboot.respbody;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class GreetRespBody {
    private LocalDateTime timestamp;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
