package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int left, int mid, int right){
         ArrayList<Number> temp = new ArrayList<>();

         int l = left;
         int r = mid + 1;

         while(l <= mid && r <= right){
            if(arr[l] <= arr[r]){
                temp.add(arr[l]);
                l++;
            } else {
                temp.add(arr[r]);
                r++;
            }
         }

        while(l <= mid){
            temp.add(arr[l]);
            l++;
        }

        while(r <= right){
            temp.add(arr[r]);
            r++;
        }

        for (int i = left; i <= right; i++) {
            arr[i] = (int) temp.get(i - left);
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
    public static void main(String[] args) {
        mergeSort(new int[]{3, 4, 1, 5, 27, 7, 8}, 0, 6);
    }
}
