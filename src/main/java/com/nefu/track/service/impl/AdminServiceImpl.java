package com.nefu.track.service.impl;

import com.nefu.track.entity.Admin;
import com.nefu.track.repository.AdminRepository;
import com.nefu.track.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin loginCheck(String ad_account, String ad_pwd) {
        return adminRepository.checkUser(ad_account,ad_pwd);
    }

    @Override
    public List<Admin> selectAll() {
        return adminRepository.findAllBy();
    }


    @Override
    public void register(Admin admin) {
        adminRepository.save(admin);
    }

}
