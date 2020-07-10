package com.nefu.track.service;

import com.nefu.track.entity.Admin;

import java.util.List;



public interface AdminService {
    //登陆验证
    Admin loginCheck(String ad_account, String ad_pwd);
    //查询全部
    List<Admin> selectAll();
    //注册账户
    void register(Admin admin);
}
