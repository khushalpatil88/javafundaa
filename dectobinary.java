public class dectobinary {
    
    public static void dectobin(int n){
        int mynumber = n;
        int pow = 0;
        int binnum = 0;

        while (n > 0) {
            int rem = n % 2;
            binnum += rem * Math.pow(10, pow);
            pow++;
            n = n / 2;
        }
        
        System.out.println("Binary form of " + mynumber + " is " + binnum);
    }

    public static void main(String[] args) {
        dectobin(12);
    }
}
