package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfAmountCorrect() {
        assertEquals(service.remain(900), 100);

    }

    @Test
    public void shouldCalculateIfAmountZero() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

}