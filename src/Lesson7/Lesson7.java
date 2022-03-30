package Lesson7;

public class Lesson7 {
    public static void main(String[] args){

        Cat cat1 = new Cat ("Пыжик",211);
        Cat cat2 = new Cat ("Клава", 20);

        Plate plate1 = new Plate(220);

        cat1.eat(plate1);
        cat2.eat(plate1);
        System.out.println(cat1.getName()+ " " + cat1.getSatiety());
        System.out.println(cat2.getName()+ " " + cat2.getSatiety());
        System.out.println("Еды в тарелке: " + plate1.getFood());


        Plate plate2 = new Plate(400);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Серчик", 50);
        cats[1] = new Cat("Малинка", 80);
        cats[2] = new Cat("Пирожок", 30);
        cats[3] = new Cat("Апачи", 120);
        cats[4] = new Cat("Браум", 200);

        for (int i=0; i<cats.length; i++){
            cats[i].eat(plate2);
            System.out.println(cats[i].getInfo());
        }

        System.out.println("Котов в наличии: " + Cat.getCountOfCats());

        System.out.println(plate2.getFood());
        plate2.addFood(20);
        System.out.println(plate2.getFood());
    }
}
