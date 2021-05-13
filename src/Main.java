import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Binary Search
        System.out.println("Binary search: ");
        ArrayList<Integer> binarySearchArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("    Array - " + binarySearchArray.toString());
        int intToFind = 4;
        System.out.println("    number " + intToFind + " is on " + BinarySearch.binarySearch(binarySearchArray, intToFind) + " position\n");

        // SelectionSort
        System.out.println("Selection sort: ");
        ArrayList<Integer> selectionSortArray = new ArrayList<>(Arrays.asList(6, 4, 8, 9, 1, 3, 5, 7));
        System.out.println("    Source array - " + selectionSortArray.toString());
        System.out.println("    Sorted array - " + SelectionSort.selectionSort(selectionSortArray) + "\n");

        // Recursion
        System.out.println("Recursion:");

        // Fractal
        System.out.println("    Fractal:");
        int num = 5;
        System.out.println("        " + num + "! = " + Recursion.fractal(num) + "\n");

        // Sum of array
        System.out.println("    Sum of array:");
        ArrayList<Integer> recursionSumArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("        Array - " + recursionSumArray);
        System.out.println("        Sum is " + Recursion.sum(recursionSumArray) + "\n");

        // Size of array
        System.out.println("    Size of array");
        ArrayList<Integer> recursionSizeArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("        Array - " + recursionSizeArray.toString());
        System.out.println("        Size is " + Recursion.size(recursionSizeArray) + "\n");

        // Max number
        System.out.println("    Max number:");
        ArrayList<Integer> recursionMaxArray = new ArrayList<>(Arrays.asList(1, 65, 89, -65, 0));
        System.out.println("        Array - " + recursionMaxArray.toString());
        System.out.println("        Max number is " + Recursion.max(recursionMaxArray) + "\n");

        // Binary search
        System.out.println("    Binary Search:");
        ArrayList<Integer> recursionBinarySearchArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }
}