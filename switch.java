import java.util.*;

public class switchs{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("input between 1 to 3");

        n = sc.nextInt();

        if(n==1){
            System.out.println("switch 1 on");
        }else if(n==2){
            System.out.println("switch 2 on");
        }else if(n==3){
            System.out.println("switch 3 on");
        }

        else {
            System.out.println("invalid input");
        }
    }
}