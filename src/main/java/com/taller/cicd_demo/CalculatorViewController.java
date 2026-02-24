package com.taller.cicd_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorViewController {

    @GetMapping("/")
    public String index() {
        return "calculator";
    }
}

