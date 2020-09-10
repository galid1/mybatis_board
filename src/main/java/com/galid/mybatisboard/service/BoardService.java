package com.galid.mybatisboard.service;

import com.galid.mybatisboard.mapper.BoardMapper;
import com.galid.mybatisboard.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public Long writeBoard(BoardVO boardVO) {
        return boardMapper.save(boardVO);
    }
}
