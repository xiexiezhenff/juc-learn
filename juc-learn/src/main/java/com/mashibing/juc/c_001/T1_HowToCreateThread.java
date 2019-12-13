package com.mashibing.juc.c_001;

import com.mashibing.Utils.SleepAndPrintUtil;

import java.util.concurrent.TimeUnit;

/**
 * @author xiezf@sunmnet.com
 * @date 2019-12-13
 */
public class T1_HowToCreateThread {

    static class T1 extends Thread{
        @Override
        public void run() {
            SleepAndPrintUtil.sp(this.getClass());
        }
    }

    static class T2 implements Runnable{

        @Override
        public void run() {
            SleepAndPrintUtil.sp(this.getClass());
        }
    }

    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();
        T2 t2 = new T2();
        new Thread(t2).start();

        new Thread(()->{
            SleepAndPrintUtil.sp(SleepAndPrintUtil.class);
        }).start();
    }


}
