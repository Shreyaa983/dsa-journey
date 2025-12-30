import java.util.ArrayList;
import java.util.List;
// print all subsequence of an array which sums to a given sum using recursion and backtracking
public class PatternTwo {

    public static void recursion(int i, int s, int sum, int[] arr, List<Integer> ds){
        
        int n = arr.length;

        if(n == i){
            if(s == sum){
                System.out.println(ds);
                return;
            }
            return;
        }
        //take
        s += arr[i];
        ds.add(arr[i]);
        recursion(i+1, s, sum, arr, ds);

        //not take
        s-= arr[i];
        ds.remove(ds.size()-1);
        recursion(i+1, s, sum, arr, ds);
    }
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        recursion(0, 0, 2, new int[]{1,2,1}, i); 
    }
}
