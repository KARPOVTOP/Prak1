package ru.mirea.lab1.ball;

import java.lang.*;



public class TestBall {

    public static void main (String[] args) {

        Ball b1 = new Ball ("K38", 4);

        Ball b2 = new Ball ("Hev11", 2);

        Ball b3 = new Ball ("B09", 8);

        b3.setAge(1);

        System.out.println(b1);

        b1.intoBallAge();

        b2.intoBallAge();

        b3.intoBallAge();

    }

}