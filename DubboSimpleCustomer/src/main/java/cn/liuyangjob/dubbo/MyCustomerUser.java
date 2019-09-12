package cn.liuyangjob.dubbo;

import cn.liuyangjob.dubbo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by  liuyang
 * 2019/9/12    15:02
 * cn.liuyangjob.dubbo
 * All Right Reserved by liuyang.
 **/

public class MyCustomerUser {
    
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dubbo-customer.xml");
        UserService  us = (UserService) ac.getBean("userService");
        System.out.println(us.sayHello("Tom "));
    }

}
