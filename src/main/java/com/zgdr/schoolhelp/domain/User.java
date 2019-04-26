package com.zgdr.schoolhelp.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * user表映射对象
 *
 * @author hengyumo
 * @version 1.0
 * @since 2019/4/17
 */
@Entity(name = "user")
public class User {

    /* 用户ID */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //使用默认生成方式（MySQL）：自增
    private Integer id;

    /* 用户名 */
    @Column(length = 30)
    private String name;

    /* 手机号 */
    @Column(length = 11)
    private String phone;

    /* 密码 */
    @Column(length = 255)
    private String password;

    /* 性别 */
    private boolean sex;
    
    /* 生日 */
    private Date birthdate;
    
    /* 积分 */
    private Integer points;
    
    /* 收藏帖子个数 */
    private Integer collectPostNum;

    /* 关注个数 */
    private Integer fallowNum;

    /* 角色 普通用户/管理员 */
    private boolean role;

    /* 是否学生认证 */
    private boolean isCertified;
    
    /* 是否在线 */
    private boolean isOnline;

    /* 注册时间 */
    private Date registerTime;

    /* 最近登录时间 */
    private Date lastTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getCollectPostNum() {
        return collectPostNum;
    }

    public void setCollectPostNum(Integer collectPostNum) {
        this.collectPostNum = collectPostNum;
    }

    public Integer getFallowNum() {
        return fallowNum;
    }

    public void setFallowNum(Integer fallowNum) {
        this.fallowNum = fallowNum;
    }

    public boolean getRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public boolean isCertified() {
        return isCertified;
    }

    public void setCertified(boolean certified) {
        isCertified = certified;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", points=" + points +
                ", collectPostNum=" + collectPostNum +
                ", fallowNum=" + fallowNum +
                ", role=" + role +
                ", isCertified=" + isCertified +
                ", isOnline=" + isOnline +
                ", registerTime=" + registerTime +
                ", lastTime=" + lastTime +
                '}';
    }

    public User(String name, String phone, String password, boolean sex, Date birthdate, Integer points,
                Integer collectPostNum, Integer fallowNum, boolean role, boolean isCertified,
                boolean isOnline, Date registerTime, Date lastTime) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.sex = sex;
        this.birthdate = birthdate;
        this.points = points;
        this.collectPostNum = collectPostNum;
        this.fallowNum = fallowNum;
        this.role = role;
        this.isCertified = isCertified;
        this.isOnline = isOnline;
        this.registerTime = registerTime;
        this.lastTime = lastTime;
    }

    public User() {}
}