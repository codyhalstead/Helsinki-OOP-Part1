
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int power=Integer.parseInt(reader.nextLine());
        int n=0;
        int answer=0;
        while (n<=power){
            answer+=(int)Math.pow(2, n);
            n++;
        }
        System.out.println("The result is: "+answer);
    } 
}
