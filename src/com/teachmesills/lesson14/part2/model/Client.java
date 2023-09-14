package com.teachmesills.lesson14.part2.model;

public class Client implements Runnable {
    private Station station;

    public Client(Station store) {
        this.station = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            station.get();
        }
    }
}
