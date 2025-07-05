import java.util.Scanner;
import java.util.Random;
class GuessGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(50)+1;
        int guess=0;
        int attempts = 0;

        System.out.println("Guess a number in between 1 and 50");
        while(guess != num){
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if(guess<num){
                System.out.println("Your guessed number is low than correct number");
            } else if (guess>num) {
                System.out.println("Your guessed number is high than correct number");
            }else{
                System.out.println("🎉🎉🎉 congratulatons it is correct");
            }
        }
        System.out.println("Attempts: "+attempts);

    }
}