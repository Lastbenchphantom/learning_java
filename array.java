import java.util.*;

public class array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int r, c, x;

        System.out.println("enter row size");
        r = sc.nextInt();

        System.out.println("enter column size");
        c = sc.nextInt();

        int numbers[][] = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.println("enter number of " + (i+1) + "," + (j+1));
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter target number");
        x = sc.nextInt();

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(numbers[i][j] + " ");
                if(numbers[i][j]==x){
                }
            }
            System.out.print("\n");
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(numbers[i][j]==x){
                    System.out.println("Target found at index " + i + " " + j);
                }
            }
        }

        System.out.println("Target not found");

    }
}