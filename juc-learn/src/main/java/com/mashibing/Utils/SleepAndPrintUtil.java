package com.mashibing.Utils;

import java.util.concurrent.TimeUnit;

/**
 * @author xiezf@sunmnet.com
 * @date 2019-12-13
 */
public class SleepAndPrintUtil {

    public static void sp(Integer num, String s){
        for(int i = 0; i < num; i++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s);
        }
    }

    public static void sp(Class clazz){
        sp(10, clazz.getName());
    }

    public static void sp(){
        sp(SleepAndPrintUtil.class);
    }
}
