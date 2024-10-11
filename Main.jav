//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Jean D King
 */

public class Main {
  public static void main(String[] args) {
    // System.out.println("hello, world!");

    Lab1 lab = new Lab1();
  

// An array
int[] array = {5, 9, 3, 12, 7, 3, 11, 5};

// Output the array in order 
System.out.println("Array in order:");
int i = 0;
while (i < array.length) {
  System.out.print(array[i] + " ");
  i++;
}
System.out.println();

// reverse using a for loop
System.out.println("Array in reverse:");
for (int j = array.length - 1; j >= 0; j--) {
  System.out.print(array[j] + " ");
}
System.out.println();


System.out.println("First value: " + array[0]);
System.out.println("Last value: " + array[array.length - 1]);
System.out.println("Sum of array: " + lab.sum(array));
System.out.println("Average of array: " + lab.average(array));
System.out.println("Maximum value in array: " + lab.max(array));
System.out.println("Minimum value in array: " + lab.min(array));



  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  // return the maximum of two integers
  public static int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  //  return the minimum of two integers
  public static int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  //  return the sum of an array 
  public static int sum(int[] numbers) {
    int total = 0;
    for (int num : numbers) {
      total += num;
    }
    return total;
  }

  // return the average 
  public static double average(int[] numbers) {
    int total = sum(numbers); 
    return (double) total / numbers.length;
  }

  public static int max(int[] numbers) {
    int maximumValue = numbers[0];
    for (int num : numbers) {
      if (num > maximumValue) {
        maximumValue = num;
      }
    }
    return maximumValue;
  }

  public static int min(int[] numbers) {
    int minimumValue = numbers[0];
    for (int num : numbers) {
      if (num < minimumValue) {
        minimumValue = num;
      }
    }
    return minimumValue;
  }


}
