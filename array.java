import java.util.*;

public class array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int r, c;

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

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}