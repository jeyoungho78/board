package com.jyh.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<?> selectBoardList() throws Exception{
        return sqlSession.selectList("selectBoardList");
    }

}
