package com.example.spring_db_test.controller;

import com.example.spring_db_test.dto.RequestDTO;
import com.example.spring_db_test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
// 보통 /api/v1/ 로 시작함
@RequestMapping(value = "/api/v1/test")
public class testController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    public ResponseEntity<?> findAll() {
        RequestDTO responseDTO = new RequestDTO();
        responseDTO.setResultCode("S0001");
        responseDTO.setRes(testService.findAll());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}