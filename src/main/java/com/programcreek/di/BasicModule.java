package com.programcreek.di;

import com.google.inject.AbstractModule;

public class BasicModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(CPU.class).to(Intel.class);
    }
}
