package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by id00 on 19/05/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Ready Home";
    }
}
