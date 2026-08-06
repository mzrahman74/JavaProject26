package com.mohammad;

public class TcClass {
    public static void main(String[] args){
    method_one();
    }
    public static void method_one() {
        try {
            int[] numbers = {400, 500, 600};
            System.out.println(numbers[10]);
            int result = 10/0;

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
      System.out.println("Array index does not exist && Math error");
        }
    }
}
