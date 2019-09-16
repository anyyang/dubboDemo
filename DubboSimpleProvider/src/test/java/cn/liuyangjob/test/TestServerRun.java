package cn.liuyangjob.test;

import cn.liuyangjob.dubbo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by  liuyang
 * 2019/9/12    13:24
 * cn.liuyangjob.test
 * All Right Reserved by liuyang.
 **/

public class TestServerRun {
    public static void main(String args[]) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        ((ClassPathXmlApplicationContext)context).start();
        UserService  userService = (UserService) context.getBean("userService");
        System.out.println(userService.sayHello("liuyang"));
        System.in.read();
    }
}
