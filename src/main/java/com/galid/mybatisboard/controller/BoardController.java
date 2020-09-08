package com.galid.mybatisboard.controller;

import com.galid.mybatisboard.service.BoardService;
import com.galid.mybatisboard.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/boards")
    public String getBoard() {
        return "boards/board";
    }

    @PostMapping("/boards")
    public void post(@ModelAttribute BoardVO boardVO) {
        boardService.writeBoard(boardVO);
    }
}

