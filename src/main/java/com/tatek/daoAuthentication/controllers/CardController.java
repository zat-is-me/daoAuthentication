package com.tatek.daoAuthentication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myCards")
public class CardController {

    @GetMapping("")
    public String myAccount(){
        return "Cards Details: ";
    }
}
