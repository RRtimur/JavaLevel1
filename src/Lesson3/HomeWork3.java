package Lesson3;

public class HomeWork3 {

    public static void main(String[] args){
        getReverseNumbers();
        getNotEmptyMass();
        multiplyByTwo();
        diagonalInASquare();
        getMass(4, 66666);
    }


    public static void getReverseNumbers() {
        int[] onesAndZeros = new int[6];
        onesAndZeros[0] = 1;
        onesAndZeros[1] = 0;
        onesAndZeros[2] = 0;
        onesAndZeros[3] = 1;
        onesAndZeros[4] = 1;
        onesAndZeros[5] = 0;
        for(int i=0; i<onesAndZeros.length; i++){
            if( onesAndZeros[i] == 1){
                onesAndZeros[i] = 0;
                }
            else {
                onesAndZeros[i] = 1;
                }
            System.out.println(onesAndZeros[i]);
            }
        System.out.println();
        }

    public static void getNotEmptyMass(){
        int[] emptyMass = new int[100];
        for (int i=0; i<emptyMass.length; i++){
            emptyMass[i] = 1+i;
            System.out.println(emptyMass[i]);
        }
        System.out.println();
    }

    public static void multiplyByTwo(){
        int[] someNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0; i<someNumbers.length; i++){
        if(someNumbers[i] <6 ){
            someNumbers[i]*=2;
        }
        else {
        }
        System.out.println(someNumbers[i]);
        }
        System.out.println();
    }
    public static void diagonalInASquare(){
        int n = 5;
        int[][] square = new int [6][6];
        for (int i = 0 ; i<6 ; i++){
            for(int j=0; j<6; j++){
                if(i == j) {
                    square[i][j] = 1;
                }else if(j == n) {
                    square[i][j] =1;
                    n--;
                }
                System.out.print(square[i][j] + "  ");
                }
            System.out.println();
            }
        System.out.println();
        }
        public static void getMass(int len, int initialValue){
        int [] mass = new int[len];
        for (int i=0; i<mass.length; i++){
            mass[i]=initialValue;
            System.out.println(mass[i]);
        }


        }
}


