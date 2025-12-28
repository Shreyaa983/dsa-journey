import java.util.Arrays;

public class Lecturefour {
    public static int[] reversearray(int[] arr, int i, int j){
        if(i > j){
            return arr;
        }
        

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return reversearray(arr, i+1, j-1);
    }

    public static boolean palin(String str, int i , int j){
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        if(i >= j){
            return true;
        }
        return palin(str, i+1, j-1);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reversearray(new int[]{3,4,5,6,7}, 0, 4)));
        System.out.println(palin("madam", 0, 4));
    }
}
