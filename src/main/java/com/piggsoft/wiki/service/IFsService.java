/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2017/9/30                           Create
 */
package com.piggsoft.wiki.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.List;

/**
 * @author yaochen4
 * @version 1.0
 * @create 2017/9/30
 * @since 1.0
 */
public interface IFsService {

    /**
     * 获取跟路径
     * @return 根路径
     */
    String getRootPath();

    /**
     * 获取路径下所有的文件和目录
     * @return 文件目录集合
     */
    List<String> getAllPath();

    /**
     * 清楚所有的文件
     */
    void clear();

    /**
     * 向目标位置添加文件
     * @param file 文件相对路径+文件名
     * @param content 文件内容，UTF-8格式
     */
    void add(String file, String content);

    /**
     * 更新目标位置的文件
     * @param file 文件相对路径+文件名
     * @param content 文件内容，UTF-8格式
     */
    void update(String file, String content);

    /**
     * 删除目标目录或者文件
     * @param file 目标目录或者文件
     */
    void del(String file);

    /**
     * 读取目标文件
     * @param file 文件相对路径+文件名
     * @return BufferedReader
     */
    BufferedReader reader(String file);

    /**
     * 读取目标文件
     * @param file 文件相对路径+文件名
     * @return InputStream
     */
    InputStream inputStream(String file);
}
