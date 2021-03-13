package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: weiei
 * @date: 2021/03/13
 **/
@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("test")
    public String test() {
        return "Hello world!";
    }
}
