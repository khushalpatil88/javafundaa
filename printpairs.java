public class printpairs {
    public static void pairs(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");

            }
            System.out.println();
        }
    }

    public static void subarrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
           
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <=end; k++) {
                  System.out.print( numbers[k] + " ");
                }
                ts++;
                System.out.println();
              

            }
            System.out.println();
        }
        System.out.println("total numbers of  the subarrays: " +  ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 4, 6, 7, 10 };

        // pairs(numbers);
        subarrays(numbers);
    }
}
