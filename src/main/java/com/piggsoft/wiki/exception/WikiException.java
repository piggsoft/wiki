/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2017/9/30                           Create
 */
package com.piggsoft.wiki.exception;

/**
 * @author yaochen4
 * @version 1.0
 * @create 2017/9/30
 * @since 1.0
 */
public class WikiException extends Exception {

    private static final String formatter = "code: %d, message: %s";

    private int code;
    private String msg;

    public WikiException(final int code, final String msg) {
        super(String.format(formatter, code, msg));
        this.code = code;
        this.msg = msg;
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
