import java.util.Scanner;

public class ATM_program {

    private  static Scanner scanner;
    private static String accountName="Patrick";
    private static long accountNumber=298025922;
    private static int balance=10_000;
    private static int withdrawCharges=200;

    public static void main(String[] args){

         scanner=new Scanner(System.in);
         services();
    }

    public static void services(){

        int choose;
        System.out.println("Choose for service you want ");
        System.out.println("press 1 for checking balance");
        System.out.println("press 2 for withdrawing");
        System.out.println("Press 3 to Exit");

         choose = scanner.nextInt();

         switch (choose){

             case 1:
                 System.out.println("Balance for account number: " + accountNumber + " of "+ accountName + " is " + balance);
                 break;
             case 2:
                 int amount;
                 System.out.println("please enter the amount to withdraw");
                 amount=scanner.nextInt();

                 if( (amount+withdrawCharges) <= balance){
                     balance=balance-(amount+withdrawCharges);

                     System.out.println("You withdrawn: " + amount + " from your bank account" +" and withdraw charges of " +withdrawCharges);
                     System.out.println("Now your new balance is: " + balance);
                 }
                 else{
                     System.out.println("Insufficient balance!!");
                     System.out.println("Enter amount less than: " + (balance-withdrawCharges));
                 }
                 break;
             case 3:
                 System.out.println("Thank you far banking with Bank of Kigali!");
                 System.exit(0);
                 break;
             default:
                 System.out.println("Invalid option:");

         }

    }

}
