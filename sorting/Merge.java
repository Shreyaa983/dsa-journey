package sorting;
import java.util.*;

public class Merge {
    public static void merge(int[] arr, int s, int m, int e) {
        int n1 = m - s + 1;
        int n2 = e - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[s + i];
        for (int i = 0; i < n2; i++)
            R[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = s;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void divide(int[] arr, int s, int e) {
        if (s >= e)
            return;
        int m = s + (e - s) / 2;
        divide(arr, s, m);
        divide(arr, m + 1, e);
        merge(arr, s, m, e);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        divide(new int[] { 3, 4, 1, 5, 27, 7, 8 }, 0, 6);
        
    }
}
