
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        drawNumber();
        System.out.print("Guess a number: ");
        int gmade=0;
          while (true) {
               int guess = Integer.parseInt(reader.nextLine());
               
               if (guess == numberDrawn) {
                   break;}
               else if (numberDrawn<guess){
                   gmade++;
                   System.out.println("The number is lesser, guesses made: "+gmade);
              }else{
                   gmade++;
                   System.out.println("The number is greater, guesses made: "+gmade);
              }
        
        
    } System.out.println("Congratulations, your guess is correct!");}

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }

}