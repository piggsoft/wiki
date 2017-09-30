/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2017/9/30                           Create
 */
package com.piggsoft.wiki.config;

import com.piggsoft.wiki.exception.WikiException;
import com.piggsoft.wiki.vo.Response;
import com.piggsoft.wiki.vo.ResponseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author yaochen4
 * @version 1.0
 * @create 2017/9/30
 * @since 1.0
 */
@ControllerAdvice
public class WikiExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(WikiExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response handleException(Exception e) {
        LOGGER.error(e.getMessage(), e);
        return ResponseBuilder.error(500, "System Error").build();
    }

    @ExceptionHandler(WikiException.class)
    @ResponseBody
    public Response handleWikiException(WikiException e) {
        LOGGER.error(e.getMessage(), e);
        return ResponseBuilder.error(e.getCode(), e.getMsg()).build();
    }


}
