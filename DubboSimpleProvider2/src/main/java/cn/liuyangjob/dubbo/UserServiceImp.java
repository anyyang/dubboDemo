package cn.liuyangjob.dubbo;

import cn.liuyangjob.dubbo.service.UserService;

/**
 * Created by  liuyang
 * 2019/9/12    12:01
 * cn.liuyangjob.dubbo
 * All Right Reserved by liuyang.
 **/

public class UserServiceImp implements UserService {

    @Override
    public String sayHello(String name) {
        System.out.println(name+"调用sayHello！2.0");
        return name + "hello world2.0";
    }
}
