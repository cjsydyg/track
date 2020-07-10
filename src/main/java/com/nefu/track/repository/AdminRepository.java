package com.nefu.track.repository;

import com.nefu.track.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// @Query(value = "from Admin a where a.adaccount=:adaccount and a.adpwd=:adpwd")

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
    @Query("from Admin a where a.ad_account=:ad_account and a.ad_pwd=:ad_pwd")
    Admin checkUser(@Param("ad_account") String adaccount, @Param("ad_pwd") String adpwd);
    @Query("from Admin a")
    List<Admin> findAllBy();
}