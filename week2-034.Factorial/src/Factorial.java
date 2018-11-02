import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int limit=Integer.parseInt(reader.nextLine());
        int n=1;
        int fractorial=1;
        while(n<=limit){
            fractorial*=n;
            n++;
                    }
        System.out.println("Fractorial is "+fractorial);
        
        
    }
}
