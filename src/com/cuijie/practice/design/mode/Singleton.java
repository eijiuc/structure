package com.cuijie.practice.design.mode;

//饿汉模式 -- 声明私有对象的时候就new出实例来。
//线程安全的
/** 需要注意的点
 * 1.实例在类装载时就创建了，会长时间占用内存。
 * 所以要保证改对象实例一定会被使用，才有价值和意义。
 * 2. 私有构造函数中不能有太多实现，如果过多则会造成性能问题。
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
