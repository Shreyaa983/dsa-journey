//in optimized alog: add a flag, for checking is it is swapped.
package sorting;
import java.util.*;
public class Bubble {
   public static void sort(int[] arr) {
   
    for(int i = 0; i < arr.length; i++){
        for(int j = 0 ; j < arr.length -i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    System.out.println(Arrays.toString(arr));
}

public static void main(String[] args) {
    sort(new int[]{3, 4,1, 5, 27, 7, 8});
}
}
