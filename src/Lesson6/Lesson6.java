package Lesson6;

import sun.security.mscapi.CPublicKey;

import java.util.Stack;

public class Lesson6 {
    public static void main(String[] args){
        Cat barsik = new Cat("Барсик");
        Cat pijik = new Cat("Пыжик");
        Dog sharik = new Dog("Шарик");
        Dog bobik   = new Dog("Бобик");
        Animals turtle = new Animals("Имба"); // "Имба" потому что будет бегать и плавать на любые дистанции


        turtle.run(700);
        barsik.run(250);
        barsik.swim(20);
        sharik.run(400);
        sharik.swim(9);
        System.out.println("Котов в наличие "+ Cat.getCount());
        System.out.println("Собак в наличие "+ Dog.getCount());
        System.out.println("Животных в наличие "+ Animals.getCount());
    }

}
