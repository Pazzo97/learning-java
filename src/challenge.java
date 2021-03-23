public class challenge {
    public static void main(String[] args){

       int number=1;

       while(number<=10){

           if(!isEvenNumber(number)){
               number++;
               continue;

           }
           System.out.println(number+ "\tis even number");
           number++;

       }

    }

    public static boolean isEvenNumber(int number){

        if(number %2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
