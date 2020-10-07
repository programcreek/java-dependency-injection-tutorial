package com.programcreek.di;

import java.util.Random;

public class Intel implements CPU{
    @Override
    public void start() {
        System.out.println("Intel is started.");
    }

    @Override
    public int getUsage() {
        return new Random().nextInt(100);
    }
}
