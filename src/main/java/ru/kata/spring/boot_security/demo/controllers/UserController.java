package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public String authUser(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
//        if(user.getRoles().toString().contains("ROLE_ADMIN")){
//            return "admin_bootstrap";
//        }else {
        return "user_bootstrap";
        }
    }
