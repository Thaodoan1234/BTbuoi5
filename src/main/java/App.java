import java.util.Scanner;

public class App {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.format("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        mangSNT(arr);
        chiaHet(arr);
        sum(arr);


    }

    public static void printArray(int[] a) {
        for (int i=0; i<a.length; i++) {
            System.out.format("%d, ", a[i]);
        }
        System.out.println();
    }


    public static boolean prime(int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }


   public static boolean isPrime(int[] arr) {
       for (int i = 0; i<arr.length; i++) {
            if (!prime(arr[i])) {
                return false;
            }
        }
       return true;
   }


    public static void chiaHet(int[] arr) {
        int dem=0;
        for (int i = 0; i<arr.length; i++) {
            if((arr[i] % 4) ==0 && (arr[i] % 5) != 0) {
                dem++;
            }
        }
        System.out.format("có %d số chia het cho 4 mà không chia het cho 5\n ", dem);
    }

   public static int sum(int[] a) {
        int total =0;
        for (int i=0; i<a.length; i++) {
            if (prime(a[i])) {
                total += a[i];
            }
        }
        return total;
   }


   public static void mangSNT(int[] a) {
        int dem = 0;
       for (int i = 0; i<a.length; i++) {
           if (prime(a[i])) {
               dem += 1;
           }
       }
       if(dem == a.length) {
           System.out.println("Mảng toàn số nguyên tố");
       }
   }
}
