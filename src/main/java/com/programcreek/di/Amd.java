package com.programcreek.di;

import java.util.Random;

public class Amd implements CPU {
    @Override
    public void start() {
        System.out.print("Amd is started");
    }

    @Override
    public int getUsage() {
        return new Random().nextInt(100);
    }
}
