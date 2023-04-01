package ru.netology;

import ru.netology.service.CashbackHackService;

public class Main {
    public static void main(String[] args) {
        int amount = 100;
        CashbackHackService service = new CashbackHackService();
        System.out.println(service.remain(amount));
    }
}