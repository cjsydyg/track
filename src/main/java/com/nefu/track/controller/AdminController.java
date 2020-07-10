package com.nefu.track.controller;

import com.nefu.track.entity.Admin;
import com.nefu.track.service.AdminService;
import com.nefu.track.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("adminController/")
public class AdminController {
    @Autowired
    AdminService as;
    @RequestMapping("login")
    public String adminLogin(
            @RequestParam("ad_account") String adaccount,
            @RequestParam("ad_pwd") String adpwd) {
        System.out.println("验证登录");
        Admin admin = null;
        admin = as.loginCheck(adaccount, adpwd);
        if (admin != null) {
            return "index";
        }else {
            return "404";
        }
    }
    @RequestMapping("register")
    public String adminRegister(Admin admin, Map<String,Object> map){
        as.register(admin);
        map.put("msg","注册成功");
        return "admin_register";
    }
}
