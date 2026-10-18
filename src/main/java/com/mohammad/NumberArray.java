package com.mohammad;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.stream;

public class NumberArray {
  public static void main(String[] args) {
      int [] arr = {100, 200, 300, 300, 400};
    System.out.println(duplicateExist(arr));
    method_four(arr);
    method_five();
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
    /*
    return boolean true for the duplicate array int
     */
    public static boolean hasDuplicate() {
        int [] numbers = {1, 4, 500, 400, 400, 600};
     boolean duplicate = stream(numbers).distinct().count() !=numbers.length;
     System.out.println(duplicate);
        return duplicate;
    }
    /*
    as a parameter hasDuplicate
     */
    public static boolean duplicateExist(int [] arr) {
        return Arrays.stream(arr).distinct().count() != arr.length;
    }
    /*
    find the second-highest number
     */
    public static int method_four(int [] numbers) {
   return stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    }
    /*
    find the highest number
     */
    public static void method_five() {
        int [] arrays = {500, 400, 200, 300, 100, 10};
    stream(arrays)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .findFirst()
        .ifPresent(System.out::println);
    }
}
