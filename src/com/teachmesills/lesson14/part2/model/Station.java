package com.teachmesills.lesson14.part2.model;

public class Station {
    private int car;

    public synchronized void get() {
        while (car < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        car--;

        System.out.println("The client took one car.");
        System.out.println("Cars being serviced: " + car);

        notify();
    }

    public synchronized void put() {
        while (car >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        car++;

        System.out.println("Took one car for service.");
        System.out.println("Cars being serviced: " + car);

        notify();
    }
}
