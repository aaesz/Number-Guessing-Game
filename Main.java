import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        char playAgain;
        int round = 1;
        do{
            System.out.println("This is Round " + round);
            int num = rn.nextInt(100)+1;
            int guess = 0;
            int attempt = 1;
            while(guess != num){
                System.out.println("Attempt: " + attempt);
                System.out.print("Guess the number: ");
                guess = sc.nextInt();

                int diff = guess - num;

                if(diff == 0){
                    System.out.println("Correct");
                    break;
                }else if(attempt == 10){
                    System.out.println("Out of attempts, number was " + num);
                    break;
                }else if(diff > 10){
                    System.out.println("Too High");
                }else if(diff < -10){
                    System.out.println("Too Low");
                }else{
                    System.out.println("Close");
                }
                attempt++;
            }
            System.out.print("Do you want to play again (Y/N): ");
            playAgain = sc.next().charAt(0);
            round++;
        }while(playAgain == 'y' || playAgain == 'Y');
    sc.close();
    }
}