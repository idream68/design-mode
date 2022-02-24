package com.study.design.mode.singleton.way1;

import java.util.concurrent.CountDownLatch;

public class Singleton1 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int threadNum = 100;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum; i ++) {
            new Thread(
                    () -> {
                        for (int i1 = 0; i1 < 10000; i1++) {
                            Entity entity = Entity.getInstance();
                        }
                        countDownLatch.countDown();
                    }
            ).start();
        }
        countDownLatch.wait();
        System.out.println(System.currentTimeMillis() - start);
    }
}

