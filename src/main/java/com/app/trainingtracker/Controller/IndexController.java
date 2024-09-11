package com.app.trainingtracker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("")
    public String indexController(Model model) {

        model.addAttribute("text", "Hello World!");

        return "index";
    }
}
