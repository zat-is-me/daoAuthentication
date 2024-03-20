package com.tatek.daoAuthentication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @GetMapping("")
    public String myAccount(){
        return "Notice Details: ";
    }
}
