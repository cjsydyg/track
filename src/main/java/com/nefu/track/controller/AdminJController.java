package com.nefu.track.controller;

import com.nefu.track.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("admin/")
public class AdminJController {
    @Autowired
    AdminService as;

    @RequestMapping("login")
    public String adminLogin(){
        return "admin_login";
    }

    @RequestMapping("register")
    public String adminRegister(){
        return "admin_register";
    }
}
