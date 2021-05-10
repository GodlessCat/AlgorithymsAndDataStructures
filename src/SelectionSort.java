import java.util.ArrayList;

public class SelectionSort {

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> array) {

        for (int i = 0; i < array.size(); i++) {

            int min = array.get(i);
            int minIndex = i;

            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j) < min) {
                    min = array.get(j);
                    minIndex = j;
                }
            }

            array.set(minIndex, array.get(i));
            array.set(i, min);
        }

        return array;
    }
}
