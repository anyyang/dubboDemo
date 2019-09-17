package cn.liuyangjob.dubbo.service;


public interface UserMethodCacheService {
    /**
     * 开启方法缓存
     * @param name
     * @return
     */
    public String sayHello(String name);

    /**
     * 不开启方法缓存
     * @param name
     * @return
     */
   public String sayHelloWithOutCache(String name);
}
