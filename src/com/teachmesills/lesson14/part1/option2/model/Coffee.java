package com.teachmesills.lesson14.part1.option2.model;

import static java.lang.Thread.sleep;

public class Coffee implements Runnable {
    Thread thread;

    public Coffee() {
        thread = new Thread(this);
        thread.setPriority(1);
        thread.start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Coffee: " + i);
            try {
                sleep(1200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
