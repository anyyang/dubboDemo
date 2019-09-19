package cn.liuyangjob.dubbo;

import cn.liuyangjob.dubbo.service.UserMethodCacheService;
import com.alibaba.dubbo.config.annotation.Reference;


public class UserMethodCacheServiceImp implements UserMethodCacheService {
    @Override
    public String sayHello(String name) {
        System.out.println("cache! cache!" + name + "sayhello2.0");
        return name + " say hello cache2.0!";
    }

    @Override
    public String sayHelloWithOutCache(String name) {
        System.out.println("nocache! nocache!" + name + "sayHelloWithOutCache2.0");
        return name + " say hello without cache2.0!";
    }
}
