package com.galid.mybatisboard.mapper;

import com.galid.mybatisboard.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER")
    List<User> findAllUser();
}
