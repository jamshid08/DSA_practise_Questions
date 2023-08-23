import java.util.Scanner;

// you have to print first n fibonacci numbers
// take n as input from the user.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0, b=1;


        for (int i = 0; i <= n; i++) {

            System.out.print(a+" ");
            int c = a+b;
            a= b;
            b =c;
        }
    }
}