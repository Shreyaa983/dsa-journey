import java.util.ArrayList;
import java.util.List;

// print all the subsequences of an array using recursion and backtracking
public class Pattern {
    public static void recursion(int i, List<Integer> ds, int[] arr){
        int n = arr.length;
        //BASE CONDITION
        if(i >= n){
            System.out.println(ds);
            return;
        }
        //TAKE
        ds.add(arr[i]);
        recursion(i+1, ds, arr); 

        //NOT TAKE
        ds.remove(ds.size()-1);
        recursion(i+1, ds, arr);

    }

    public static void main(String[] args){
        List<Integer> i = new ArrayList<>();
        recursion(0, i, new int[]{1,2,3,4} );
    }
}
