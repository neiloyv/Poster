package ua.neilo.poster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class HomeController {

    @GetMapping
    public String homePage(Map<String, Object> model) {
        return "home";
    }


}
