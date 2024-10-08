public class primenum {
    public static void isprime(int n ){
         
           
         for(int i =2; i<=n-1; i++){
            if(n%i==0){
                System.out.println(n + "  number is  not prime number ");
                break;
            }else{
                System.out.println(n + "  number is prime number");
                break;
            }
         }
        
    }

    public static void main(String args[]){
        isprime(23);
    }
}
