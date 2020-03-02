package com.cuijie.practice.design.mode;

//懒汉模式 -- 单例对象的实例实在获取这个实例时才创建的。
// 线程不安全的
/**
 * 双重检测机制
 */

/** 不安全原因
 *  由于指令重排序的原因，创建实例的指令可能会产生重排序。
 *  （对象创建步骤，1.类加载检查；2.分配内存；3.初始化零值；4.设置对象头；5.执行init；6.设置栈中对象指向分配的内存）
 *  多线程同时执行，A线程执行到nstance = new Singleton3();时发生了指令重排序后先执行了6。
 *  B线程判断instance已经非等于null了，则直接返回了instance，而该实例还没被初始化所以会存在问题。
 */
public class Singleton3 {
    //单例对象
    private static Singleton3 instance = null;
    //私有的构造函数
    private Singleton3(){}

    //获取单例对象的方法
    public static Singleton3 getInstance() {
        if(instance == null){
            synchronized(Singleton3.class){
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
