public class SwitchInJava {

         public static void main(String[] args) {
            // write your code here

            String day = "8";

            // capitalize the first letter
            // 1. convert it into array
            // 2. convert letter at index 0
            // 3. convert the array into word ie join

//        char [] charArray = dayName.toCharArray();
//
//        String[] dayArray = new String[charArray.length];
//        for (int i = 0; i < charArray.length; i++){
//            dayArray[i] = String.valueOf(charArray[i]);
//        }
//
//        System.out.println(dayArray[0].toUpperCase());



            switch (day){

                case "Monday":
                    System.out.println("It is\t" + day + "\tget your ass to work!");
                    break;

                case "Tuesday":
                    System.out.println("It is\t" + day + "\tget your ass to work!");
                    break;

                case "Wednesday":
                    System.out.println("It is\t" + day + "\tget your ass to work!");
                    break;

                case "Thursday":
                    System.out.println("It is\t" + day + "\tget your ass to work! two days to go");
                    break;

                case "Friday":
                    System.out.println("It is\t" + day + "hang in there\tit is almost a weekend\nOnly 10 hours to go ");
                    break;

                case "Saturday": case"Sunday":
                    System.out.println("It is a weekend!\nEnjoy life!\t it is too short");
                    break;

                default:
                    System.out.println("Day is invalid \t maybe in another life\t another planet");

            }

        }
    }


