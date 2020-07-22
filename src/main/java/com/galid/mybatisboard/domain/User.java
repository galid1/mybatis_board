package com.galid.mybatisboard.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    private Long userId;
    private String name;
    private String authId;
    private String password;
}
