import java.util.Scanner;

public class evenNumber {

    public static void main(String[] args){

        System.out.println("Enter a number of your choice!");
        Scanner scanner=new Scanner(System.in);
        int n;
        n= scanner.nextInt();

        if(isEven(n)){
            System.out.println(n + " Even number!");
        }
        else{
            System.out.println(n + " is not Even number!");
        }

    }

    public static boolean isEven(int n){

        if (n % 2 == 0){
            return true;
        }
        return false;
    }
}
