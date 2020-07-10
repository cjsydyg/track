package com.nefu.track;

import com.nefu.track.entity.Admin;
import com.nefu.track.repository.AdminRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TrackApplicationTests {

    @Autowired
    AdminRepository adminRepository;
    @Test
    void contextLoads() {
        List<Admin> list = null;
        list = adminRepository.findAllBy();
        System.out.println(list);
    }

}
