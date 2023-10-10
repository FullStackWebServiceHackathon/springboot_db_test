package com.example.spring_db_test.service;

import com.example.spring_db_test.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;

    public ArrayList<HashMap<String, Object>> findAll() {
        return testMapper.findAll();
//        return  testMapper.findByName("test");
    }
}