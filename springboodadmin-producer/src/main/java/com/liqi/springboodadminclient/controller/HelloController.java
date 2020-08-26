package com.liqi.springboodadminclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        log.info("hello,this is first message :{}", name);
        log.error("hello,this is first message :{}", name);
        return "hello " + name + "，this is first messge";
    }
}