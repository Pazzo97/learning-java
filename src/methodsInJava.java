public class methodsInJava {
    public static void main(String[] args){

        calculateScore(false,800,5,100);
        calculateScore(true,10000,8,200);


    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

      if(gameOver){
          int finalScore = score + (levelCompleted*bonus);
          finalScore+=1000;

          System.out.println("Your final score is \t"+ finalScore);
      }

      else{
          System.out.println("Game is not yet over!!!!");
      }

    }
}
