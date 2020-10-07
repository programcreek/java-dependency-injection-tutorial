package com.programcreek.di;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javax.inject.Inject;

public class Computer {
    private CPU cpu;

    @Inject
    Computer(CPU cpu) {
        this.cpu = cpu;
    }

    public void start() {
        cpu.start();
        // start other parts
    }

    public boolean isStatusOk() {
        //assuming this random
        if (cpu.getUsage() > 50) {
            return false;
        }

        // check other things, such as memory, hard drives.

        return true;
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BasicModule());
        Computer computer = injector.getInstance(Computer.class);
        computer.start();
        System.out.println("Status:" + (computer.isStatusOk() ? "OK" : "Not OK"));
    }
}
