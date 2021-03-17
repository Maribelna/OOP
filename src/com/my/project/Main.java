package com.my.project;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone(1, "23H", 4);
        Phone phone2 = new Phone(2, "27H");
        Phone phone3 = new Phone();
        phone1.sendMessage("890330413", "89033041326", "89033041326");
        System.out.println();
        phone2.receiveCall("Bob");
        phone3.receiveCall("Bob",6787979);

    }
}
