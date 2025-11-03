import java.util.*;

public class rhombus{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);

        int n;

        n = sc.nextInt();

        for(int i=0; i<n; i++){
            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //starts
            for(int j=0; j<n; j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}