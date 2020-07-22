package com.galid.mybatisboard.mapper;

import com.galid.mybatisboard.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER")
    List<User> findAllUser();

    @Select("SELECT * FROM USER WHERE authId = #{authId}")
    Optional<User> findByAuthId(@Param("authId") String authId);
}
