import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unsorted Array ---------------------------------------------------");
        ArrayList<Integer> integerList = Lab4.getList();
        Lab4.outputList(integerList);

        // Measure the time it takes for Bubble Sort
        long startTime = System.nanoTime();
        System.out.println("\n\nBubble sort results ----------------------------------------------");
        ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
        Lab4.outputList(bubbleSortedList);
        long endTime = System.nanoTime();
        System.out.println("\nBubble Sort time: " + (endTime - startTime) + " nanoseconds");

        // Measure the time for Insertion Sort
        startTime = System.nanoTime();
        System.out.println("\n\nInsertion sort results -------------------------------------------");
        ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
        Lab4.outputList(insertionSortedList);
        endTime = System.nanoTime();
        System.out.println("\nInsertion Sort time: " + (endTime - startTime) + " nanoseconds");
    }
}

class Lab4 {
    // Insertion sort 
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
        for (int i = 1; i < integerList.size(); i++) {
            int key = integerList.get(i);
            int j = i - 1;

            // Move elements of integerList[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && integerList.get(j) > key) {
                integerList.set(j + 1, integerList.get(j));
                j = j - 1;
            }
            integerList.set(j + 1, key);
        }
        return integerList;
    }

    // Bubble sort 
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
        int n = integerList.size();
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (integerList.get(j) > integerList.get(j + 1)) {
                    // Swap the elements
                    int temp = integerList.get(j);
                    integerList.set(j, integerList.get(j + 1));
                    integerList.set(j + 1, temp);
                }
            }
        }
        return integerList;
    }

    public static ArrayList<Integer> getList() {
        ArrayList<Integer> integerList = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
            while ((line = br.readLine()) != null) {
                integerList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return integerList;
    }

    public static void outputList(ArrayList<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
    }
}
// 1. If you were implementing a sort algorithm for a new language, which sort would you use?
// If I was implementing a sort algorithm for a new language I would consider using Merge Sort or Quick Sort. These algorithms are more efficient than Insertion 
//and Bubble Sort with average time complexities of O(n log n) this is better than the O(n^2) time complexity of Insertion and Bubble Sort.


// 2. Was there a difference in the time it took for bubble and insertion sort to run? Does this make sense given the time complexities for these sorting algorithms?
//  Yes, there was a difference in the time it took for the two algorithms to run. Bubble Sort and Insertion Sort both have an average time complexity of O(n^2),
//in many way they perform the same. Insertion Sort can often be faster than Bubble Sort in practice because it typically requires fewer swaps.
//The time complexity makes sense because O(n^2) algorithms become slower as the list size increases and both algorithms perform similar operations on the list.


// 3. Which sort algorithm has an easier implementation (in terms of understanding) to you?
// Insertion Sort is easier to understand and implement compared to Bubble Sort. It works the same comparing to how you might sort playing cards in your hand, 
//inserting each element into its correct position. Bubble Sort requires multiple passes through the list and is a bit more complex to grasp, 
// even if both algorithms are relatively simple.
