import java.util.*;

public class variables{
    public static void main(String[] args){
        int a;
        int b;
        String name;

        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = a+b;

        System.out.println(name);
        System.out.println(sum);



    }
}