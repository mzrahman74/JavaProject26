package com.mohammad;

abstract class Abs {
    public abstract void animalSound();
    public void sleep() {
    System.out.println("Zzz");
    }
}

class Cat extends Abs {

    @Override
    public void animalSound() {
    System.out.println("The pig says: wee wee");
    }
}

