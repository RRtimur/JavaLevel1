package Lesson6;

public class Cat extends Animals {
    private static int countCats = 0;
    public Cat (String name){

        super(name);
        countCats++;
    }
    @Override
    public void run(int distance){
        if(distance > 0 && distance <=200){
            System.out.println( name + " пробежал " + distance + "м");
        }else if(distance > 200){
            System.out.println( name +" не смог пробежать " + distance +"м");
        }else{
            System.out.println("Вы ввели не корректную дистанцию");
        }
    }
    @Override
    public void swim(int distance){

        System.out.println( name + " не плавает!");
        System.out.println();

    }
    public static int getCount() {
        return countCats;
    }

}
