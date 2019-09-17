package cn.liuyangjob.dubbo;

import cn.liuyangjob.dubbo.service.UserMethodCacheService;
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
    UserMethodCacheService  umcs;
    public static void main(String args[]) throws IOException {
        MyCustomerUser myuser = new MyCustomerUser();
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dubbo-customer.xml");
        myuser.us = (UserService) ac.getBean("userService");
        myuser.umcs = (UserMethodCacheService)ac.getBean("userMethodCacheService");
         //单个方法  服务缓存
         myuser.userMethodProviderDubboCache();

         // 普通对象缓存
         // myuser.userProviderDubboCache();
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

    /**
     * 基于dubbo基于方法的缓存，指定服务的缓存
     */
    public void userMethodProviderDubboCache() {
        /* server端输出三次。   sayhello 一次 因为有缓存，  lynx两次因为没配置缓存
           liuyang调用sayHello！
           lynx调用sayHello！
         */
        System.out.println(umcs.sayHello("liuyang"));
        System.out.println(umcs.sayHelloWithOutCache("lynx"));
        System.out.println(umcs.sayHello("liuyang"));
        System.out.println(umcs.sayHelloWithOutCache("lynx"));
    }
}
