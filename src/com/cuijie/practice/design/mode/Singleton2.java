package com.cuijie.practice.design.mode;

//懒汉模式 -- 单例对象的实例实在获取这个实例时才创建的。
// 线程安全的
/** 不推荐原因
 * 将synchronized关键字直接放在方法上，对性能影响较大。
 */
public class Singleton2 {
    //单例对象
    private static Singleton2 instance = null;
    //私有的构造函数
    private Singleton2(){}

    //获取单例对象的方法
    public static synchronized Singleton2 getInstance() {
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

}
