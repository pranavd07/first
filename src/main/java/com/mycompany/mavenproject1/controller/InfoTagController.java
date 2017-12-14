/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/



package com.mycompany.mavenproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author pranav03
 */
@Controller
@RequestMapping("/info")
public class InfoTagController {
    
    @RequestMapping("/helloHandler")
    @ResponseBody
    public String helloContoller(){
        return "Hello";
    }
    
}
