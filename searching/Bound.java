
public class Bound {
    public int upperBound(int[] arr, int key){
       int upper = 0;
        while( upper < arr.length){
            if(arr[upper] <= key){
                upper++;
            }
            else{
                return upper;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        
    }    
}
