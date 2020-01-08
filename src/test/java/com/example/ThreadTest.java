package com.example;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther Lee53
 * @Date 2019-12-17 21:49
 */
public class ThreadTest {

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        try {
            threadTest.test20();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test20() throws InterruptedException {
        for (int i = 1; i <= 10000; i++) {
            MyThrend thrend = new MyThrend("thread" + i);
            Thread thread = new Thread(thrend);
            System.out.println(thread.getName() + "start");

            thread.start();
        }
        Thread.sleep(2000);
        System.out.println(MyCount1.count.get());
        System.out.println(MyCount1.count);
    }

    static class MyThrend implements Runnable {
        private String name;
        MyThrend(String threadName) {
            this.name = threadName;
        }

        @Override
        public void run() {
            for (int i=0;i<20;i++){
//                MyCount1.count++;
                MyCount1.count.getAndIncrement();  //加1方法
//                MyCount1.count.incrementAndGet();
                System.out.println(this.name + "count + 1 = " + MyCount1.count);

            }

        }
    }

    private static class MyCount1 {
//        static int count = 0;
        static AtomicInteger count = new AtomicInteger(0);
    }
}
