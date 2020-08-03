package cn.qphone.spring.annotation.test;

import cn.qphone.spring.annotation.web.UserServlet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class TestDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserServlet userServlet = classPathXmlApplicationContext.getBean(UserServlet.class);
        System.out.println(userServlet.getUser(1));
    }
}
