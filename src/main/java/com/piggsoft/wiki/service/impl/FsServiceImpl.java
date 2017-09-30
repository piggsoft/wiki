/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2017/9/30                           Create
 */
package com.piggsoft.wiki.service.impl;

import com.piggsoft.wiki.service.IFsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.List;

/**
 * @author yaochen4
 * @version 1.0
 * @create 2017/9/30
 * @since 1.0
 */
@Service
public class FsServiceImpl implements IFsService {

    @Value("${wiki.path}")
    private String wikiPath;
    @Value("${wiki.file_extension}")
    private String fileExtension;

    @Override
    public String getRootPath() {
        return null;
    }

    @Override
    public List<String> getAllPath() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(String file, String content) {

    }

    @Override
    public void update(String file, String content) {

    }

    @Override
    public void del(String file) {

    }

    @Override
    public BufferedReader reader(String file) {
        return null;
    }

    @Override
    public InputStream inputStream(String file) {
        return null;
    }
}
