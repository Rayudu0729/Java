package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")  // Base path
public class PageController {
    
    @GetMapping("/home")    // More specific than @RequestMapping
    public String home() {
        System.out.println("home method called");
        return "home";
    }
}