package com.suchi.quotely;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuotelyController {
    private final QuotelyService service; 
    
    public QuotelyController(QuotelyService service) {
        this.service = service;
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("quote", service.getQuote());
        return "index";
    }
}
