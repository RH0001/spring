package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Application {

    @RequestMapping("/")
    public String main() {
        return "index";
    }
}