package com.cuijie.practice.design.mode;

//枚举模式 -- 推荐使用
//线程安全的
/** 需要注意的点
 * 1
 */
public class Singleton5 {

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return SingletonEnum.INSTANCE.getSingleton5();
    }

    private enum SingletonEnum{
        INSTANCE;
        private Singleton5 singleton5;
        //JVM会保证这个方法只执行一次
        SingletonEnum(){
            singleton5 = new Singleton5();
        }
        public Singleton5 getSingleton5(){
            return singleton5;
        }
    }

}
