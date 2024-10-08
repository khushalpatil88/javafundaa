// prime number check

import java.util.*;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number : ");
        int number = sc.nextInt();

        while(number>0){
            if(number%2==0){
                System.out.println("number is not prime ");
            }else{
                System.out.println("number is prime ");
          
            }
        }
      }
}
