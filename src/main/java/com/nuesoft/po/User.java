package com.nuesoft.po;

import java.util.Date;

public class User {

    private String username;
    private String password;
    private String love;
    private Date birthday;
    private int age;

    public User() {
    }

    public User(String username, String password, String love, Date birthday, int age) {
        this.username = username;
        this.password = password;
        this.love = love;
        this.birthday = birthday;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", love='" + love + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }
}
