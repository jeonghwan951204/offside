package com.offside.offside.controller;

import com.offside.offside.module.SearchAPI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/search")
    public String search(@RequestParam String name, Model model){
        // api module(name);
        // return -> json ->
        // model.addAttribute("player", );
        SearchAPI.getPlayer(name);

        return "search";
    }
}
