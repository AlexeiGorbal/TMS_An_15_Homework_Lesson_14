package com.teachmesills.lesson14.part2;

import com.teachmesills.lesson14.part2.model.Client;
import com.teachmesills.lesson14.part2.model.Service;
import com.teachmesills.lesson14.part2.model.Station;

public class Main {
    public static void main(String[] args) {
        Station store = new Station();
        Client client = new Client(store);
        Service service = new Service(store);

        new Thread(client).start();
        new Thread(service).start();
    }
}
