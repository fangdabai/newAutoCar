package com.yinuo.newautocar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4j2TestController {

    // 创建日志记录器
    private static final Logger logger = LoggerFactory.getLogger(Log4j2TestController.class);

    @GetMapping("/hello")
    public String sayHello() {
        logger.info("This is an info log.");
        logger.error("This is an error log.");
        logger.debug("This is a debug log.");
        return "Hello, World!";
    }
}
