package com.teachmesills.lesson14.part1.option1.model;

public class Coffee extends Thread {

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
