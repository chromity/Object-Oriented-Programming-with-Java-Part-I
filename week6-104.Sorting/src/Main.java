
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(values));
        sort(values);
        System.out.println(Arrays.toString(values));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int indexSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexSmallest]) {
                indexSmallest = i;
            }
        }

        return indexSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexSmallest = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < array[indexSmallest]) {
                indexSmallest = i;
            }
        }

        return indexSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempHolder;

        tempHolder = array[index2];
        array[index2] = array[index1];
        array[index1] = tempHolder;

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array ,i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
