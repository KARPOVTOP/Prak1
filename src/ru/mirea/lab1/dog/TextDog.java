package ru.mirea.lab1.dog;


import  java.lang.*;

public class TextDog {
    public static void main (String[] args) {
        Dog d1 = new Dog ("Mike", 2);
        Dog d2 = new Dog ("Helen", 5);
        Dog d3 = new Dog ("Nike", 1 );
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}