package com.mashibing.juc.c_001;

import com.mashibing.Utils.SleepAndPrintUtil;

/**
 * @author xiezf@sunmnet.com
 * @date 2019-12-13
 */
public class T2_Sleep_Join_Yield {

    public static void main(String[] args) {
       // TestSleep();
      //  testJoin();
        testYield();
    }

    static void TestSleep(){
        new Thread(()->{
            SleepAndPrintUtil.sp(10, "A");
        }).start();

        new Thread(()->{
            SleepAndPrintUtil.sp(10, "B");
        }).start();
    }

    static void testJoin(){
        Thread thread = new Thread(() -> {
            SleepAndPrintUtil.sp(10, "A");
        });
        thread.start();

        new Thread(()->{
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SleepAndPrintUtil.sp(10, "B");
        }).start();
    }


    static void testYield(){
       new Thread(() -> {
           for(int i = 0; i < 10; i++){
               SleepAndPrintUtil.sp(1, "thread1");
               Thread.yield();
           }
        }).start();

        new Thread(() -> {
            for(int i = 0; i < 10; i++){
                SleepAndPrintUtil.sp(1, "thread2");
                Thread.yield();
            }
        }).start();
    }
}
