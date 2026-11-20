package com.mohammad;

public class Number {
    public static void main(String[] args){
        int testNum = -8;
        if (isEven(testNum)){
      System.out.println(testNum + " is Even");
        } else {
      System.out.println(testNum + " is Odd");
        }

    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static boolean isOdd(int number) {
        return number % 2 !=0;
    }
}
