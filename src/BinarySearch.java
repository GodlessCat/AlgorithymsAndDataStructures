import java.util.ArrayList;

public class BinarySearch {

    public static int binarySearch(ArrayList<Integer> array, int num) {
        int leftIndex = 0;
        int rightIndex = array.size() - 1;

        while (leftIndex <= rightIndex) {
            int currentIndex = (leftIndex + rightIndex) / 2;

            if (array.get(currentIndex) == num){
                return currentIndex;
            }

            if (array.get(currentIndex) < num) {
                leftIndex = currentIndex + 1;
            } else {
                rightIndex = currentIndex - 1;
            }
        }

        return -1;
    }
}
