package com.example.demo.model.ov;

import lombok.Data;

/**
 * @program: lucene
 * @description:
 * @author: obsidian
 * @create: 2019-05-13 19:53
 */
@Data
public class Result<T> {
    /**
     * 标识码
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String message;
    /**
     * 数据
     */
    private T data;
}
