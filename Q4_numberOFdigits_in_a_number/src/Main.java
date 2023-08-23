import java.util.Scanner;

// you have to count the number of digits in a number
// take number as input
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit =0;
        while(number != 0){
            number/= 10;
            digit ++;
        }

        System.out.println(digit);
    }
}