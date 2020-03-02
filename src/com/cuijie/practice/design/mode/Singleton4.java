package com.cuijie.practice.design.mode;

//懒汉模式 -- 单例对象的实例实在获取这个实例时才创建的。
// 线程安全的
/**
 * 安全原因
 * 给单例对象增加volatile关键字，来防止指令重排序
 * 再加上双重检测机制
 */
public class Singleton4 {
    //单例对象
    private static volatile Singleton4 instance = null;

    //私有的构造函数
    private Singleton4() {
    }

    //获取单例对象的方法
    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

}
