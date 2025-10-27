package sorting;
import java.util.Arrays; 

public class Selection {
    public static void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if (minIndex != i) {
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    System.out.println(Arrays.toString(arr));
}

public static void main(String[] args) {
    sort(new int[]{3, 4,1, 5, 27, 7, 8});
}
}
