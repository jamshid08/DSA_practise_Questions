import java.util.Scanner;

// IS a number prime or not
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int no_of_numbers = sc.nextInt();

       for(int i=0; i<no_of_numbers; i++){
           int number = sc.nextInt();
           int count =0;
           for(int d = 2; d<=number/2; d++){
               if(number%d==0){
                   count++;
                   break;
               }

           }

           if(count == 0)
               System.out.println("prime");
           else
               System.out.println("not prime");
       }
    }
}