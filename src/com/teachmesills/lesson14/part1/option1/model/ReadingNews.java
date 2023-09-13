package com.teachmesills.lesson14.part1.option1.model;

public class ReadingNews extends Thread {

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
