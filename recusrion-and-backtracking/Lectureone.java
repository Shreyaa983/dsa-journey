public class Lectureone {

    public static void print(int n){
        if(n==0){
            return;
        }

        System.out.println("Shreya");
        n--;
        print(n);

    }


    public static void printlinear(int n){
        if(n == 6){
            return;
        }

        System.out.print(n + " ");
        n++;
        printlinear(n);
    }
    public static void main(String[] args) {
        print(5);
        printlinear(1);
    }  
}
