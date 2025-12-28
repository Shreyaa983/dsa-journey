package sorting;

import java.util.Arrays;

public class Insertion {
   public static void sort(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) {
        int key = arr[i];      // pick up the card
        int j = i - 1;

        // shift elements that are greater than key
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;      // insert the card
    }

    System.out.println(Arrays.toString(arr));
}

    public static void main(String[] args) {
        sort(new int[]{23,7,1,4,8,3});
    }
}
