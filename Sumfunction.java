import java.util.*;

public class Sumfunction{

    public static int Sum(int a, int b){

        int sum = a+b;

        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a, b, sum;

        a = sc.nextInt();
        b = sc.nextInt();

        sum = Sum(a, b);

        System.out.println(sum);


    }
}