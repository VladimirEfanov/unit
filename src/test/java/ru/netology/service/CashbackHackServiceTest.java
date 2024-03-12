package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldCalculateIfAmountCorrect() {
        assertEquals(service.remain(900), 100);

    }

    @org.junit.Test
    public void shouldCalculateIfAmountZero() {
        assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void shouldCalculateIfAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

}