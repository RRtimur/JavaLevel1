package Lesson6;

public class Dog extends Animals{
    private static int countDogs = 0;
    public Dog (String name){

        super(name);
        countDogs++;
    }
    @Override
    public void run(int distance){
        if(distance > 0 && distance <=500){
            System.out.println( name + " пробежал " + distance + "м");
        }else if(distance>500){
            System.out.println(name + " не смог пробежать " + distance +"м");
        }else{
            System.out.println("Вы ввели не корректную дистанцию");
        }
    }
    @Override
    public void swim(int distance){
        if(distance > 0 && distance <= 10){
        System.out.println(name + " проплыл " + distance + "м");
        }else if(distance > 10){
            System.out.println(name + " не смог проплыть " + distance + "м");
        }else{
            System.out.println("Вы ввели не корректную дистанцию");
        }
        System.out.println();
    }

    public static int getCount() {
        return countDogs;
    }
}
