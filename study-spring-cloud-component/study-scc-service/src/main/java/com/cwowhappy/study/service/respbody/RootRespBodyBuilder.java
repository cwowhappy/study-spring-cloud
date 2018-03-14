package com.cwowhappy.study.service.respbody;

public class RootRespBodyBuilder {
    public static <T> RootRespBody<T> build(RespStatus status, String message, T data) {
        RootRespBody<T> rootRespBody = new RootRespBody<>();
        rootRespBody.setStatus(status);
        rootRespBody.setMessage(message);
        rootRespBody.setData(data);

        return rootRespBody;
    }
}
