package com.hunter.budget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/setup")
public class SetupController {

    @GetMapping
    public String index() {
        return "/pages/setup";
    }
}
