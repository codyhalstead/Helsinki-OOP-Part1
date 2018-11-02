import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics estats = new NumberStatistics();
        NumberStatistics ostats = new NumberStatistics();
        System.out.println("Type numbers:");
        while(true){
            int input1 = Integer.parseInt(reader.nextLine());
            if(input1==-1){
                break; }
            else{
                stats.addNumber(input1);
                if(input1%2==0){
                    estats.addNumber(input1);
                }else{
                    ostats.addNumber(input1);
                }
            }
       }System.out.println("Sum: "+stats.sum());
        System.out.println("Sum of even: "+estats.sum());
        System.out.println("Sum of odd: "+ostats.sum());
    }
}
    