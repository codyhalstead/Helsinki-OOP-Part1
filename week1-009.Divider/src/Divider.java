
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        double input1=Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        double input2=Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.println("Division: "+input1+" / "+input2+" = "+(input1/input2));
    }
}
