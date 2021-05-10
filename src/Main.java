import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Binary Search
        ArrayList<Integer> binarySearchArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int intToFind = 4;
        System.out.println("Binary search: " + intToFind + " is on " + BinarySearch.binarySearch(binarySearchArray, intToFind) + " position");

        // SelectionSort
        ArrayList<Integer> selectionSortArray = new ArrayList<>(Arrays.asList(6, 4, 8, 9, 1, 3, 5, 7));
        System.out.println("Selection sort: " + SelectionSort.selectionSort(selectionSortArray));
    }
}