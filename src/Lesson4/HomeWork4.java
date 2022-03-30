package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {

       String[][] map = fillMap(3);
       createMap(map);

       while (true){

       playerTurn(map);
       if (IsWinner("X", map) || isDraw(map)){

           createMap(map);
           System.out.println("Игрок Победил!");
           break;
       }

       createMap(map);
       computerTurn(map);
       createMap(map);
           if (IsWinner("0", map) || isDraw(map)){

               System.out.println("Компьютер Победил!");
           }
       }

    }

    public static void playerTurn(String [][] map){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ход игрока");


        boolean isPlayerTurn = true;

        while(isPlayerTurn) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if ((x > 0 && x <= map[0].length) && (y > 0 && y <= map.length)) {
                if (map[x-1][y-1].equals("*")) {
                    map[x-1][y-1] = "X";
                    isPlayerTurn = false;
                } else {
                    System.out.println("Поле занято! Попробуйте другое поле.");
                }
            } else {
                System.out.println("Вы вышли за рамки игрового поля!");
            }
        }
    }

    public static void computerTurn (String[][] map){

        System.out.println("Ход компьютера!");
        Random random = new Random();


        boolean isComputerTurn = true;

        while(isComputerTurn) {

            int x = random.nextInt(map[0].length);
            int y = random.nextInt(map.length);

            if (map[x][y].equals("*")) {
                    map[x][y] = "0";
                    isComputerTurn = false;
            }
            }
    }

    public static void createMap(String[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] fillMap(int size) {
        String[][] map = new String[size][size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "*";
            }
        }
        return map;
    }

    public static boolean IsWinner (String mark, String[][] map){
        for (int i = 0; i < 3; i++)
            if ((map[i][0].equals(mark) && map[i][1].equals(mark) && map[i][2].equals(mark)) ||
                    (map[0][i].equals(mark) && map[1][i].equals(mark) && map[2][i].equals(mark))) {
                return true;
            }
        if (
                (map[0][0].equals(mark) && map[1][1].equals(mark) && map[2][2].equals(mark)) ||
                        (map[0][2].equals(mark) && map[1][1].equals(mark) && map[2][0].equals(mark))
        ){
            return true;
        }
        return false;
    }

    public static boolean isDraw (String [][] map){
        for(int i=0; i<map[0].length; i++){
            for(int j=0; j<map.length; j++){
                if (map[i][j].equals("*")){
                    return false;
                }
            }
        }
        System.out.println("Ничья!");
        return  true;
    }
}

