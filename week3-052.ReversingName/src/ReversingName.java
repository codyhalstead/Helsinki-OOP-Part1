import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name=reader.nextLine();
        int i=0;
        int x=name.length()-1;
        System.out.print("In reverse order: ");
        while(i<name.length()){
            System.out.print(name.charAt(x-i));
            i++;
        }System.out.println("");
    }
}
