package com.yinuo.newautocar.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "示例控制器", description = "示例控制器 API")
@RestController
@RequestMapping("/api")
public class SpringDocTestController {
    @Operation(summary = "获取示例数据", description = "根据ID获取示例数据")
    @GetMapping("/example")
    public String getExample(@Parameter(description = "示例ID", required = true) @RequestParam String id) {
        return "示例数据: " + id;
    }
}


