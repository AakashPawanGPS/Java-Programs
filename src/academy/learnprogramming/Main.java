package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        System.out.println("Your Final Score was : "+highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        System.out.println("Your Final Score was : "+highScore);

        int position=calculateHighScorePosition(1500);
        displayHighScorePosition("Aakash",position);

        position=calculateHighScorePosition(900);
        displayHighScorePosition("Pawan",position);

        position=calculateHighScorePosition(400);
        displayHighScorePosition("Sushma",position);


        position=calculateHighScorePosition(50);
        displayHighScorePosition("Sri",position);



    }

    public static int calculateScore(boolean gameOver , int score , int levelCompleted, int bonus ) {


        if(gameOver){
            int finalScore= score +(levelCompleted*bonus);
            finalScore+=3000;
            return  finalScore;
        }

        return  -1;

    }

    public static void displayHighScorePosition(String name , int position){
        System.out.println(name + " managed to get into position "+position+" on the High Score Table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        }
//        else if(playerScore>=500 ){
//            return 2;
//        }
//        else if(playerScore>=100 ) {
//            return 3;
//        }
//        return 4;
        int position = 4;
        if(playerScore>=1000){
            position=1;
        }
        else if(playerScore>=500){
            position = 2;
        }
        else if(playerScore>=100){
            position =3;
        }
        return position;

    }
}
