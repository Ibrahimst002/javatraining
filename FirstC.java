public class FirstC {
    public static void main(String[] args) {

    }
    public static void  calculateScore(){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted =5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted + bonus);
            finalScore += 1000;
            System.out.println("Your final score was" + finalScore);
        }
    }
}
