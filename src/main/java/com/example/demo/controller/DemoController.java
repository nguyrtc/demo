package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: weiei
 * @date: 2021/03/13
 **/
@Controller
public class DemoController {
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("userName", "handsome boy");
        return "home";
    }
}
