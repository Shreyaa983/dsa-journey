// count of subsequences with sum  k
public class PatternFour {

    public static int recursion(int i, int[] arr, int s, int sum){

        int n = arr.length;
        if (i == n){
            if ( s== sum) return 1;
            return 0;
        }

        //take
        s += arr[i];
        int r = recursion(i+1, arr, s, sum);

        //not take
        s -= arr[i];
        int l = recursion(i+1, arr, s, sum);

        return l +r;
    }
    public static void main(String[] args) {
         System.out.println(recursion(0, new int[]{1,2,1}, 0, 2));
}
}