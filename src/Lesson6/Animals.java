package Lesson6;

public class Animals {

    private static int count = 0;

    public String name;

    public Animals(String name){
        this.name = name;
        count++;
    }

    public void run(int distance){
        System.out.println("Животное пробежало на " + distance + "м");
    }

    public void swim(int distance){
        System.out.println("Животное проплыло " + distance + "м");
    }

    public static int getCount() {
        return count;
    }

}
