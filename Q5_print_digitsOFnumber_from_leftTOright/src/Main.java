import java.util.Scanner;

// print digits of number from left to right
// if no. of digits =n   then divisor = 10^(n-1)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit =0;
      int temp = number;
        while(temp != 0){
            temp/= 10;
            digit ++;
        }

        int divisor = (int) Math.pow(10,digit-1);// the return type of this function is double

        while(divisor != 0){ // divisor becoz number can be 1000, 76000 etc
          int q =  number/divisor;
            System.out.println(q);
            number%=divisor;
            divisor/=10;
    }
    }
}