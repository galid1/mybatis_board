package com.galid.mybatisboard.service;

import com.galid.mybatisboard.domain.User;
import com.galid.mybatisboard.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.findAllUser();
    }
}
