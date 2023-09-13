package com.teachmesills.lesson14.part1.option2.model;

import static java.lang.Thread.sleep;

public class ReadingNews implements Runnable {
    Thread thread;

    public ReadingNews() {
        thread = new Thread(this);
        thread.setPriority(10);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Reading news: " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
