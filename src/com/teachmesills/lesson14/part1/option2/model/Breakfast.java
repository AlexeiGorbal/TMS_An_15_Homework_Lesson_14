package com.teachmesills.lesson14.part1.option2.model;

import static java.lang.Thread.sleep;

public class Breakfast implements Runnable {
    Thread thread;

    public Breakfast() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Breakfast: " + i);
            try {
                sleep(1100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
