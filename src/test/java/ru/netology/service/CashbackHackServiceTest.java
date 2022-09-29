package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual, "осталось до получения бонуса");
    }

    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual, "осталось до получения бонуса");
    }

    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(expected, actual, "осталось до получения бонуса");
    }
}