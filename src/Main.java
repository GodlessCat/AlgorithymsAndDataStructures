import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Binary Search
        List<Integer> binarySearchArray = Arrays.asList(1, 2, 3, 4, 5);
        int intToFind = 4;
        System.out.println("Binary search: " + intToFind + " is on " + BinarySearch.binarySearch(binarySearchArray, intToFind) + " position");
    }
}
