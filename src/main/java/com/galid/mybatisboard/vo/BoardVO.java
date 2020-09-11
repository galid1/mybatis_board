package com.galid.mybatisboard.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BoardVO {
    private String title;
    private String contents;
    private Long writer;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}

