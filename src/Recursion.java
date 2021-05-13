import java.util.ArrayList;

public class Recursion {

    public static int fractal(int num) {

        if (num == 1) {
            return 1;
        } else {
            return num * fractal(num - 1);
        }
    }

    public static int sum(ArrayList<Integer> array) {
        if (array.size() == 0) {
            return 0;
        } else if (array.size() == 1) {
            return array.get(0);
        } else {
            return array.get(0) + sum(remove(array, 0));
        }
    }

    private static ArrayList<Integer> remove(ArrayList<Integer> array, int index) {
        array.remove(index);
        return array;
    }

    public static int size(ArrayList<Integer> array) {
        if (array.size() == 0) {
            return 0;
        } else if (array.size() == 1) {
            return 1;
        } else {
            return 1 + size(remove(array, 0));
        }
    }

    public static int max(ArrayList<Integer> array) {
        if (array.size() == 0) {
            return 0;
        } else if (array.size() == 1) {
            return array.get(0);
        } else {
            return Math.max(array.get(0), max(remove(array, 0)));
        }
    }
//
//    public static int binarySearch(ArrayList<Integer> array, int num) {
//        if (array.size() == 0) {
//            return -1;
//        } else {
//
//        }
//    }
}
