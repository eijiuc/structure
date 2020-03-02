package com.cuijie.practice.design.mode;

//懒汉模式 -- 单例对象的实例实在获取这个实例时才创建的。
//当前的实现是 "线程不安全的"
/** 线程不安全的原因
 * 当多个线程同时调用或者私有构造函数中实现较多，
 * 有可能导致 if(instance == null) 不能正确判断。
 * 造成会创建多个实例出来。
 */
public class Singleton1 {
    //单例对象
    private static Singleton1 instance = null;
    //私有的构造函数
    private Singleton1(){}

    //获取单例对象的方法
    public static Singleton1 getInstance() {
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }

}
