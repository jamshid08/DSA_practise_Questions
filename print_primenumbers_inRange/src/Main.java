import java.util.Scanner;

// Print prime numbers between a range     Range = low to high
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int number =low; number<=high; number++){
            int count =0;

            for(int d =2; d<=number/2; d++){
                if(number%d == 0){
                    count++;
                    break;
                }
            }

            if(count==0)
                System.out.print(number+" ");
        }
    }
}