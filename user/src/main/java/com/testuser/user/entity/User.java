package com.testuser.user.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   userId;
    private String userName;
    private String userSalary;
    private String userCompany;
    private String userDOB;
    private String userGender;

    @Transient
    private List<Contact> contact;

    @Transient
    private List<Department> department;

    public User() {
    }

    public User(Long userId, String userName, String userSalary, String userCompany, String userDOB, String userGender, List<Contact> contact,List<Department> department) {
        this.userId = userId;
        this.userName = userName;
        this.userSalary = userSalary;
        this.userCompany = userCompany;
        this.userDOB = userDOB;
        this.userGender = userGender;
        this.contact = contact;
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSalary='" + userSalary + '\'' +
                ", userCompany='" + userCompany + '\'' +
                ", userDOB='" + userDOB + '\'' +
                ", userGender='" + userGender + '\'' +
                ", contact=" + contact + '\'' +
                ", department=" + department +
                '}';
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setDepartment(List<Department> department) {
        this.department = department;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(String userSalary) {
        this.userSalary = userSalary;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    public String getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(String userDOB) {
        this.userDOB = userDOB;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
}
