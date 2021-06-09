package com.company;

public class Dog extends Animal {

    private int eyes;
    private  int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    private void chew(){

    }

    public void walk(){
        System.out.println("Dog walks");
        move(5);
    }

    public void run(){
        System.out.println("Dog runs");
        move(10);
    }

}
