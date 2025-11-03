import java.util.*;

public class patternprinting1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int row, col;

        row = sc.nextInt();
        col = sc.nextInt();

        for(int r=1; r<=row; r++){
            for(int c=1; c<=col; c++){
                if(r==1 || r==row){
                    System.out.print("*");
                } else if (c==1 || c==col){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}