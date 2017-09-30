/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2017/9/30                           Create
 */
package com.piggsoft.wiki.vo;

/**
 * @author yaochen4
 * @version 1.0
 * @create 2017/9/30
 * @since 1.0
 */
public class ResponseBuilder {

    private static final int CODE_SUCCESS = 0;
    private static final String MSG_SUCCESS = "success";

    private int code;
    private String msg;

    private ResponseBuilder() {
    }

    public static final ResponseBuilder ok() {
        ResponseBuilder builder = new ResponseBuilder();
        builder.code = CODE_SUCCESS;
        builder.msg = MSG_SUCCESS;
        return builder;
    }

    public static final ResponseBuilder error(int code, String msg) {
        ResponseBuilder builder = new ResponseBuilder();
        builder.code = code;
        builder.msg = msg;
        return builder;
    }

    public final <T> Response<T> build() {
        return data(null);
    }

    public final <T> Response<T> data(T data) {
        return new Response<>(this.code, this.msg, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
