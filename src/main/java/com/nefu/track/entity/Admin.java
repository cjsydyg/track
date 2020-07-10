package com.nefu.track.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table ( name = "admin")//数据表名称
public class Admin {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private int ad_id;
      @Column
      private int ad_phone;
      @Column
      private String ad_account;
      @Column
      private String ad_pwd;

      public int getAd_id() {
            return ad_id;
      }

      public void setAd_id(int ad_id) {
            this.ad_id = ad_id;
      }

      public int getAd_phone() {
            return ad_phone;
      }

      public void setAd_phone(int ad_phone) {
            this.ad_phone = ad_phone;
      }

      public String getAd_account() {
            return ad_account;
      }

      public void setAd_account(String ad_account) {
            this.ad_account = ad_account;
      }

      public String getAd_pwd() {
            return ad_pwd;
      }

      public void setAd_pwd(String ad_pwd) {
            this.ad_pwd = ad_pwd;
      }

      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Admin admin = (Admin) o;
            return ad_id == admin.ad_id &&
                    ad_phone == admin.ad_phone &&
                    Objects.equals(ad_account, admin.ad_account) &&
                    Objects.equals(ad_pwd, admin.ad_pwd);
      }

      @Override
      public int hashCode() {
            return Objects.hash(ad_id, ad_phone, ad_account, ad_pwd);
      }

      @Override
      public String toString() {
            return "Admin{" +
                    "ad_id=" + ad_id +
                    ", ad_phone=" + ad_phone +
                    ", ad_account='" + ad_account + '\'' +
                    ", ad_pwd='" + ad_pwd + '\'' +
                    '}';
      }

}
