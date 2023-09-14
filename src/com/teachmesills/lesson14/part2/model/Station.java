package com.teachmesills.lesson14.part2.model;

public class Station {
    private int currentCar;

    public synchronized void get() {
        while (currentCar < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        currentCar--;

        System.out.println("The client took one car.");
        System.out.println("Cars being serviced: " + currentCar);

        notify();
    }

    public synchronized void put() {
        while (currentCar >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        currentCar++;

        System.out.println("Took one car for service.");
        System.out.println("Cars being serviced: " + currentCar);

        notify();
    }
}
