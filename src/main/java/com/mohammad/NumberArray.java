package com.mohammad;

import java.util.Comparator;

import static java.util.Arrays.stream;

public class NumberArray {
  public static void main(String[] args) {

  }

  /*
  find the lowest age from the array
   */
  public static int method_one(int [] ages) {
    int lowestAge = ages[0];
    for (int age : ages) {
      if (lowestAge > age) {
        lowestAge = age;
      }
    }
    return lowestAge;
  }

  /*
  find the highest number from the array
   */
  public int method_two(int [] numbers) {
 return stream(numbers).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
  }
  /*
  find the second-lowest number from the array
   */
    public int method_three(int[] numbers) {
   return stream(numbers).boxed().sorted().distinct().skip(1).findFirst().get();
    }
}
