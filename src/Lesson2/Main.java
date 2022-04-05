package Lesson2;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSumInRange(16,5));
        isPositiveNumberOrNot(24);
        System.out.println(isNegativeNumber(9));
        printWordsAndNumbersSomeTimes("some words",15,3); //words=любые слова,n= число,x= указанное кол-во раз
        System.out.println(isLeapYear(1900)); //задание*
    }
    public static boolean isSumInRange(int x, int n){
        boolean result = (x+n) >=10 && (x+n)<=20;
        return result;
    }
    public static void isPositiveNumberOrNot(int x){
        if (x % 2 == 0){
            System.out.println("Число положительное");
        }
        else{
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isNegativeNumber(int x){
        boolean result = !(x % 2 == 0 );
        return result;
    }
    public static void printWordsAndNumbersSomeTimes( String words, int n, int x){
        for (int i=0; i < x; i++){
            System.out.println(words + " " +n);
        }
    }
    public static boolean isLeapYear(int x){
        if (x % 4 == 0 && !(x % 100 == 0)) {
            return true;
        }
        else if (x % 400 == 0){
            return true;
        }
        else {
            return false;
        }
        }
    }