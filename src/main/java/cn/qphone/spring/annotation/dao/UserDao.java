package cn.qphone.spring.annotation.dao;

import cn.qphone.spring.annotation.pojo.User;

/**
 * @author Administrator
 */
public interface UserDao {
    User getUser(int id);
}
