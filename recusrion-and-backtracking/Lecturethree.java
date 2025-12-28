public class Lecturethree {
    public static void sum(int i, int n){
        if(i== 0){
            System.out.println(n);
            return;
        }
        

         sum(i-1,n + i);
    }

    public static void main(String[] args) {
       sum(3, 0);
       System.out.println(fucntionsum(3));
       System.out.println(fac(5));
    }

    public static int fucntionsum(int i){
        if(i == 0){
            return 0;
        }   

       return i + fucntionsum(i-1);
    }

    public static int fac(int n){
        if(n == 1){
            return 1;
        }

        return n * fac(n-1);
    }
}
