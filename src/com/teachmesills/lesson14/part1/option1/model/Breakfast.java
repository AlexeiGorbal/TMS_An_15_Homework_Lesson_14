package com.teachmesills.lesson14.part1.option1.model;

public class Breakfast extends Thread{

    public void run(){
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
