package com.example.demo.service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.dto.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    public List<Test> getAll() throws Exception{
        return testMapper.getAll();
    }
}