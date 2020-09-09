package com.galid.mybatisboard.mapper;

import com.galid.mybatisboard.vo.BoardVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface BoardMapper {
    @Options(useGeneratedKeys = true, keyProperty = "ID", keyColumn = "ID")
    @Insert("INSERT INTO BOARD(title, contents, writer, createdDate, lastModifiedDate)" +
            "VALUES(#{title}, #{contents}, #{writer}, sysdate, sysdate))")
    Long save(BoardVO boardVO);
}
