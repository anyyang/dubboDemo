package cn.liuyangjob.dubbo;

import cn.liuyangjob.dubbo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by  liuyang
 * 2019/9/12    15:02
 * cn.liuyangjob.dubbo
 * All Right Reserved by liuyang.
 **/

public class MyCustomerUser {
    UserService us;

    public static void main(String args[]) throws IOException {
        MyCustomerUser myuser = new MyCustomerUser();
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dubbo-customer.xml");
        myuser.us = (UserService) ac.getBean("userService");
        myuser.userProviderDubboCache();
        System.in.read();
    }

    /**
     * dubbo提供基于结果的消费者缓存，如果上次查过这条数据了，
     * 下次查询的时候 直接使用缓存了
     * 配置 只需要在xml配置中加入 cache=true
     */
    public void userProviderDubboCache() {
        /* server端输出两次
           liuyang调用sayHello！
           lynx调用sayHello！
         */
        System.out.println(us.sayHello("liuyang"));
        System.out.println(us.sayHello("lynx"));
        System.out.println(us.sayHello("liuyang"));
        System.out.println(us.sayHello("lynx"));
    }
}
