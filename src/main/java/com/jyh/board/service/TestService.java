package com.jyh.board.service;

import com.jyh.board.mapper.TestMapper;
import com.jyh.board.dto.Test;
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