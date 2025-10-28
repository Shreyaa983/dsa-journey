package sorting;

import java.util.Arrays;

public class Insertion {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 1; i< n; i++){
            int j = i-1;

            while(j >= 0 && arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        sort(new int[]{23,7,1,4,8,3});
    }
}
