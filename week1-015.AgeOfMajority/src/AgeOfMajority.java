
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here 
        System.out.println("How old are you? ");
        int Age=Integer.parseInt(reader.nextLine());
        System.out.println("");
        if (Age<18){
            System.out.println("You have not reached the age of majority yet!");
        } else{ 
            System.out.println("You have reached the age of majority!");
        }
    }
}
