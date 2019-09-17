package cn.liuyangjob;

import cn.liuyangjob.dubbo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by  liuyang
 * 2019/9/12    14:44
 * cn.liuyangjob
 * All Right Reserved by liuyang.
 **/

/**
 *   Provider1 启动！
 */
public class ProviderStater1 {
    public static void main(String args[]) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        ((ClassPathXmlApplicationContext)context).start();
        System.out.println("provider run success!");
        System.in.read();
    }
}
