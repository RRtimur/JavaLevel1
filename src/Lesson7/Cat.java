package Lesson7;

public class Cat {
    private static int countOfCats = 0;
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
        countOfCats++;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.setFood(plate.getFood() - appetite);
            satiety = true;
        } else {
            System.out.println(name + " хочет больше еды! Котик не стал кушать!");
        }
    }


    public String getName() {
        return name;
    }

    public static int getCountOfCats() {
        return countOfCats;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public String getInfo() {
        return name + " " + satiety;
    }
}