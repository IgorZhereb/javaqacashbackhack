package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void calculateCashBackZero(){

        CashbackHackService service = new CashbackHackService();

        int amount = 0;

      int actual = service.remain(amount);
      int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateCashBack123(){

        CashbackHackService service = new CashbackHackService();

        int amount = 123;

        int actual = service.remain(amount);
        int expected = 877;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateCashBack400(){

        CashbackHackService service = new CashbackHackService();

        int amount = 400;

        int actual = service.remain(amount);
        int expected = 600;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateCashBack1000(){

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateCashBackOverLimit(){

        CashbackHackService service = new CashbackHackService();

        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateCashBackOverLimit2(){

        CashbackHackService service = new CashbackHackService();

        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}