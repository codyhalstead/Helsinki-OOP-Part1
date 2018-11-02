
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String Name1=reader.nextLine();
        System.out.println("Type your age: ");
        int Age1=Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.println("Type your name: ");
        String Name2=reader.nextLine();
        System.out.println("Type your age: ");
        int Age2=Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.println(Name1+" and "+Name2+" are "+(Age1+Age2)+" years old in total.");
        
    }
}
