import java.util.*;

public class Factorial{

    public static void myFactorial(int n){
        int factorial = 1;

        if(n<=d0){
            System.out.println("Invalid input\n");
            return;
        }

        for (int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);

        return ;
    }


    public static void main(String args[]){
        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        myFactorial(n);


    }
}