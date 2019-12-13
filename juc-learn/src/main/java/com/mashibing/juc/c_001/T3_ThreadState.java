package com.mashibing.juc.c_001;

import com.mashibing.Utils.SleepAndPrintUtil;

/**
 * @author xiezf@sunmnet.com
 * @date 2019-12-13
 */
public class T3_ThreadState {

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(this.getState());
            SleepAndPrintUtil.sp(this.getClass());
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(myThread.getState());
    }
}
