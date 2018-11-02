
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int start=Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int end=Integer.parseInt(reader.nextLine());
        while (start<=end){
            System.out.println(start);
            start++;
        }
        

    }
}
