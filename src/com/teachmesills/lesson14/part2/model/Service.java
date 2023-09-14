package com.teachmesills.lesson14.part2.model;

public class Service implements Runnable {
    private Station station;

    public Service(Station store) {
        this.station = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            station.put();
        }
    }
}