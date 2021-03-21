import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n ;
        n= scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

//        int count=0;
//        for(int i=2;i<100;i++){
//            if (isPrime(i)){
//                count++;
//                System.out.println( i + " is a prime number!");
//
//            }
//        }




    }

    public static boolean isPrime(int n) {
//        if (n<= 1) {
//            return false;
//        }
        for (int i = 2; i<= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}