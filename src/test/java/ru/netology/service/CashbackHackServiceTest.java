package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void calculateCashBackZero(){

        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateCashBack123(){

        CashbackHackService service = new CashbackHackService();

        int amount = 123;

        int expected = 877;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateCashBack400(){

        CashbackHackService service = new CashbackHackService();

        int amount = 400;

        int expected = 600;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateCashBack1000(){

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateCashBackOverLimit(){

        CashbackHackService service = new CashbackHackService();

        int amount = 1100;

        int expected = 900;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateCashBackOverLimit2(){

        CashbackHackService service = new CashbackHackService();

        int amount = 2000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

}