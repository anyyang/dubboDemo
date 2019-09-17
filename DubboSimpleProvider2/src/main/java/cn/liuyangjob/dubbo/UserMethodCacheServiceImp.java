package cn.liuyangjob.dubbo;

import cn.liuyangjob.dubbo.service.UserMethodCacheService;
import com.alibaba.dubbo.config.annotation.Reference;


public class UserMethodCacheServiceImp implements UserMethodCacheService {
    @Override
    public String sayHello(String name) {
        System.out.println("cache! cache!" + name + "sayhello");
        return name + " say hello cache!";
    }

    @Override
    public String sayHelloWithOutCache(String name) {
        System.out.println("nocache! nocache!" + name + "sayHelloWithOutCache");
        return name + " say hello without cache!";
    }
}
