package com.example.spring_db_test.dto;

import lombok.*;

@Getter
@Setter
@Data
@Builder
public class RequestDTO {
    private String resultCode;
    private Object res;

    // 기본 생성자
    public RequestDTO() {
    }

    // 생성자
    public RequestDTO(String resultCode, Object res) {
        this.resultCode = resultCode;
    }

    // Getter와 Setter 메서드
    public String getResultCode() {

        return resultCode;
    }
    public void setResultCode(String resultCode) {

        this.resultCode = resultCode;
    }

    public void setRes(Object res) {
        this.res = res;
    }

    public Object setRes() {
        return res;
    }
}