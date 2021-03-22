public class forLoop {

    public static void main(String[] args){

        for(int i=8;i>=2;i--){

            double interest = calculateInterest(10000,i);

            System.out.println("Interest rate at\t"+ i +"% interest ="+"\t is "+ String.format("%2f",interest));

        }



    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount*(interestRate/100));

    }

}
