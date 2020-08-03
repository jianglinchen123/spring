package cn.qphone.spring.annotation.service.impl;

import cn.qphone.spring.annotation.dao.UserDao;
import cn.qphone.spring.annotation.pojo.User;
import cn.qphone.spring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
