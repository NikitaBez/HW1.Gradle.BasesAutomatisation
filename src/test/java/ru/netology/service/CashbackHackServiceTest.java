package ru.netology.service;

import junit.framework.TestCase;

public class CashbackHackServiceTest extends TestCase {

    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}