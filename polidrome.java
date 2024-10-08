
import java.util.Scanner;

public class polidrome {
    public static void main(String[] args) {
        System.out.println("pleasee enter a number");
        Scanner sc = new Scanner(System.in);
        int polidrome = sc.nextInt();

        if (ispolindrome (polidrome)){
            System.out.println("number: "+ polidrome + "is a polidrome");

        }else{
            System.out.println("number: "+ polidrome + "is a not polidrome");
        }

    }

    public static boolean ispolindrome(int number){
        int polidrome = number;
        int reverse = 0;

        while(polidrome != 0){
            int remainder = polidrome % 10 ;
            reverse = reverse * 10 + remainder;
            polidrome = polidrome / 10;
        }

        if(number == reverse){
            return true;
        }
        return false;
    }
}
