package com.my.project;

public class Phone {
    long number;
    String model;
    int weight;

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(long number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, long number) {
        System.out.println("Звонит " + name + " " + number);
    }


    public long getNumber() {
        return number;
    }

    public void sendMessage(String... vars) {
        for (String args : vars) {
            System.out.print(" " + args);
        }
    }


}
