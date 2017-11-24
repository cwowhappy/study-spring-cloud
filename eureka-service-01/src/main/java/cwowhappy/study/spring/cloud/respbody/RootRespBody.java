package cwowhappy.study.spring.cloud.respbody;

import com.fasterxml.jackson.annotation.JsonValue;

public class RootRespBody<T> {
    private Status status;
    private String message;
    private T data;

    public static <U> RootRespBody<U> build(Status status, String message, U data) {
        RootRespBody<U> respBody = new RootRespBody<>();
        respBody.setStatus(status);
        respBody.setMessage(message);
        respBody.setData(data);
        return respBody;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public enum Status {
        SUCCESS(200), FAIL(400), EXCEPTION(500);
        private int value;
        Status(int value) {
            this.value = value;
        }

        @JsonValue
        public int getValue() {
            return value;
        }
    }
}
