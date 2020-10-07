package com.programcreek.di;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class ComputerTest {
    @Test
    public void testIsStatusOk(){
        CPU cpu = mock(CPU.class);
        // mock cpu usage, so we can focus on testing other part
        when(cpu.getUsage()).thenReturn(10);
        assertTrue(new Computer(cpu).isStatusOk());

        when(cpu.getUsage()).thenReturn(90);
        assertFalse(new Computer(cpu).isStatusOk());
    }
}
