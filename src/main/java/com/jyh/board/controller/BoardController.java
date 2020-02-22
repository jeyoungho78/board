package com.jyh.board.controller;

import com.jyh.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/boardList")
    public String boardList(ModelMap modelMap) throws Exception {

        List<?> listview = boardService.selectBoardList();

        modelMap.addAttribute("listview", listview);

        return "board/boardList";
    }

}
