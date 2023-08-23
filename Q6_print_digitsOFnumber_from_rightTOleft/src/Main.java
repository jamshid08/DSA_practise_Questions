import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        while(number != 0){
            int q =  number%10;
            System.out.println(q);
            number /=10;

        }
    }
}