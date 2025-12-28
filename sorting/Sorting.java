//optimized bubble sort (with flag)
//worst case- O(n^2)
//best case - o(n)         normal sort best case : o(n^2)

package sorting;
import java.util.Arrays;

public class Sorting {
   public static void bubble(int[] arr) {
   boolean swapped;
    for(int i = 0; i < arr.length; i++){
        swapped = false;
        for(int j = 0 ; j < arr.length -i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

                swapped = true;
            }
        }
        if(!swapped) break;
    }

    System.out.println(Arrays.toString(arr));
}   

    public static void selection(int arr[]){
        
        
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }

                if (minIndex != i) {
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int arr[]){

    for(int i = 1; i < arr.length; i++){
        int j = i-1;
        int key = arr[i];
        while( j >= 0  && arr[j] > key){
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = key;
    }

        System.out.println(Arrays.toString(arr));
    }
   public static void main(String[] args) {
    // bubble(new int[]{3, 4, 1, 5, 27, 7, 8});
    // selection(new int[]{3, 4, 1, 5, 27, 7, 8});
    insertion(new int[]{3, 4, 1, 5, 27, 7, 8});
    }
}
