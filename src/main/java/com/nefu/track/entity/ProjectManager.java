package com.nefu.track.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "ProjectManager")
public class ProjectManager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pm_id;
    private int pm_phone;
    private String pm_account;
    private String pm_pwd;

    public int getPm_id() {
        return pm_id;
    }

    public void setPm_id(int pm_id) {
        this.pm_id = pm_id;
    }

    public int getPm_phone() {
        return pm_phone;
    }

    public void setPm_phone(int pm_phone) {
        this.pm_phone = pm_phone;
    }

    public String getPm_account() {
        return pm_account;
    }

    public void setPm_account(String pm_account) {
        this.pm_account = pm_account;
    }

    public String getPm_pwd() {
        return pm_pwd;
    }

    public void setPm_pwd(String pm_pwd) {
        this.pm_pwd = pm_pwd;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "pm_id=" + pm_id +
                ", pm_phone=" + pm_phone +
                ", pm_account='" + pm_account + '\'' +
                ", pm_pwd='" + pm_pwd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectManager that = (ProjectManager) o;
        return pm_id == that.pm_id &&
                pm_phone == that.pm_phone &&
                Objects.equals(pm_account, that.pm_account) &&
                Objects.equals(pm_pwd, that.pm_pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pm_id, pm_phone, pm_account, pm_pwd);
    }
}
