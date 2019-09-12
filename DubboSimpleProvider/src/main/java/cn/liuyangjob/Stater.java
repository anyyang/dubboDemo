package cn.liuyangjob;

import cn.liuyangjob.dubbo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by  liuyang
 * 2019/9/12    14:44
 * cn.liuyangjob
 * All Right Reserved by liuyang.
 **/

public class Stater {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        ((ClassPathXmlApplicationContext)context).start();
        UserService userService = (UserService) context.getBean("userService");

    }
}
