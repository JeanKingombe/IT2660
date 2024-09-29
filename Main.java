//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Jean D King
 */

public class Main {
  public static void main(String[] args) {
    // System.out.println("hello, world!");

    Lab1 lab = new Lab1();
  

// Create an array with the specified values
int[] array = {5, 9, 3, 12, 7, 3, 11, 5};

// Output the array in order using a while loop
System.out.println("Array in order:");
int i = 0;
while (i < array.length) {
  System.out.print(array[i] + " ");
  i++;
}
System.out.println();

// Output the array in reverse using a for loop
System.out.println("Array in reverse:");
for (int j = array.length - 1; j >= 0; j--) {
  System.out.print(array[j] + " ");
}
System.out.println();

// Output the first and last values of the array
System.out.println("First value: " + array[0]);
System.out.println("Last value: " + array[array.length - 1]);

// Call the methods created in Lab1
System.out.println("Maximum of 5 and 9: " + lab.max(5, 9));
System.out.println("Minimum of 5 and 9: " + lab.min(5, 9));
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

  // Method to return the maximum of two integers
  public static int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  // Method to return the minimum of two integers
  public static int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  // Method to return the sum of an array of integers
  public static int sum(int[] numbers) {
    int total = 0;
    for (int num : numbers) {
      total += num;
    }
    return total;
  }

  // Method to return the average of an array of integers
  public static double average(int[] numbers) {
    int total = sum(numbers); // Reusing the sum method
    return (double) total / numbers.length;
  }

  // Method to return the maximum value in an array of integers
  public static int max(int[] numbers) {
    int maximumValue = numbers[0];
    for (int num : numbers) {
      if (num > maximumValue) {
        maximumValue = num;
      }
    }
    return maximumValue;
  }

  // Method to return the minimum value in an array of integers
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