
public class BinarySearch{
    public static int Binary(int key, int[] arr){
        int s =0; 
        int e = arr.length -1;

        while( s < e){
            int mid = s + (e-s/2);

            if(arr[mid] == key){
                return mid;
            }
            else if( arr[mid] > key){
                e = mid- 1;
            }else{
                s = mid + 1;
            }
        }

        return -1;
    }

    public static int recursiveBinary(int arr[], int key, int s, int e){

        while(s < e){
            int mid = s + (e-s/2);

            if(arr[mid] == key){
                return mid;
            }
            else if( arr[mid] > key){
                return recursiveBinary(arr, key, s, mid -1);
            }else{
                return recursiveBinary(arr, key, mid + 1, e);
            }
        }

        return -1;
    }


    public static void main(String [] args){
        int[] arr = {1,2,3,4,17,19};
        int key = 4;

        int ans = Binary(key, arr);
        System.out.println(ans);

        ans = recursiveBinary(arr, key, 0, arr.length-1);
        System.out.println(ans);
    }
}
