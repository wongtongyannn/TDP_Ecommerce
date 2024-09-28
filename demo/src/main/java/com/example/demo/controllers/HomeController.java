package com.example.demo.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import java.time.LocalDateTime;


@Controller
public class HomeController {  
    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "<h1>Welcome to Yan's webpage</h1>";
    }

    @GetMapping("/about-us")
    public String aboutUs(Model model) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        model.addAttribute("currentDateTime", currentDateTime);
        return "about-us";
}

    @GetMapping("/contact-us")
        public String contactUs(){
            return "contact-us";
        }
}
