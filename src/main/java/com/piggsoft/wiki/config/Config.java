/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2017/9/30                           Create
 */
package com.piggsoft.wiki.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author yaochen4
 * @version 1.0
 * @create 2017/9/30
 * @since 1.0
 */
@Configuration
public class Config {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("API")
                .pathMapping("/")
                .select()
                .paths(PathSelectors.any()).paths(Predicates.not(PathSelectors.regex("/error")))
                .build()
                .apiInfo(apiInfo());
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Wiki API")
                .description("使用Git， Spring Boot, Kotlin支撑的Wiki系统的API")
                .version("1.0.0")
                .termsOfServiceUrl("https://gitee.com/piggsoft/wiki")
                .contact(new Contact("piggsoft", "https://gitee.com/piggsoft/wiki", "piggsoft@163.com"))
                .license("Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }

}
