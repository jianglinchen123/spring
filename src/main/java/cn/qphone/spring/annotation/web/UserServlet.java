package cn.qphone.spring.annotation.web;

import cn.qphone.spring.annotation.pojo.User;
import cn.qphone.spring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 */

@Controller
public class UserServlet {
    @Autowired
    private UserService userService;

    public User getUser(int id) {
        return userService.getUser(id);
    }
}
