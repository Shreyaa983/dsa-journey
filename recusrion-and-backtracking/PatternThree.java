import java.util.ArrayList;
import java.util.List;
//print only one subsequence of an array which sums to a given sum using recursion and backtracking
public class PatternThree {

    public static boolean recursion(int i, int s, int sum, int[] arr, List<Integer> ds){
        int n = arr.length;
        if(n == i){
            if( s == sum){
                System.out.println(ds);
                return true;
            }

            return false;
        }

        s += arr[i];
        ds.add(arr[i]);
        if (recursion(i+1, s, sum, arr, ds) == true) return true;


        s-= arr[i];
        ds.remove(ds.size()-1);
        if (recursion(i+1, s, sum, arr, ds) == true) return true;


        return false;

    }

    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        recursion(0, 0, 2, new int[]{1,2,1}, i);
    }
}
