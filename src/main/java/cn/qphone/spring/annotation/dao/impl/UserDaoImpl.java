package cn.qphone.spring.annotation.dao.impl;

import cn.qphone.spring.annotation.dao.UserDao;
import cn.qphone.spring.annotation.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User getUser(int id) {
        return new User("江林宸");
    }
}
