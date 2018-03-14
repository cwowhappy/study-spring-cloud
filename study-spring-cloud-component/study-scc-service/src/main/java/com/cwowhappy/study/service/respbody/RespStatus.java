package com.cwowhappy.study.service.respbody;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RespStatus {
    SUCCESS(200);

    private int value;
    RespStatus(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
