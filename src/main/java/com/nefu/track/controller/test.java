package com.nefu.track.controller;

import com.nefu.track.entity.Admin;
import com.nefu.track.service.AdminService;
import com.nefu.track.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("test")
public class test {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/demo")
    //@ResponseBody
    public String fun(){
        return "index";
    }

    @RequestMapping("/test")
    public String test(){
        List<Admin> list = null;
        list = adminService.selectAll();
        if (list!=null)
        return "index";
        else return "404";
    }
}
