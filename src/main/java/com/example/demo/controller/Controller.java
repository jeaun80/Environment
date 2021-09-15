package com.example.demo.controller;


import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/index")
    public String index(){ return "/index"; }
    @RequestMapping(value="/login")
    public String login() { return "/login"; }
    @GetMapping("/next")
    public String next(){ return "/next";}
    
}
