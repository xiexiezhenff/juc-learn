package com.mashibing.juc.c_001;

import com.mashibing.Utils.SleepAndPrintUtil;

import java.util.concurrent.TimeUnit;

/**
 * @author xiezf@sunmnet.com
 * @date 2019-12-13
 */
public class T0_WhatIsThread {

    private static  class T extends Thread{
        @Override
        public void run() {
            SleepAndPrintUtil.sp(10, "T");
        }
    }

    public static void main(String[] args) {
        T t = new T();
        t.start();
        for (int i = 0 ; i < 10 ; i++){
            SleepAndPrintUtil.sp(10, "main");

        }
    }
}
