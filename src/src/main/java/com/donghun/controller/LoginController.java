package com.donghun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author dongh9508
 * @since  2019-03-29
 */
@Controller
public class LoginController {

    @GetMapping("/")
    public String root() {
        return "redirect:/todolist";
    }

    @GetMapping("/login")
    public String login() {
        return "todolist/login";
    }

    @PostMapping("/sucesslogin")
    public String todolist() {
        return "redirect:/todolist";
    }

    @PostMapping("/faillogin")
    public String loginpage() {
        return "redirect:/login";
    }

}
