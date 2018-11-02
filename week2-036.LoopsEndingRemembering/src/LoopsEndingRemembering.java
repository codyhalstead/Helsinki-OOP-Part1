import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5  
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int n=Integer.parseInt(reader.nextLine());
        int sum=0;
        int numCount=0;
        int evnum=0;
        int odnum=0;
        while (n!=-1){
            sum+=n;
            numCount++;
            if (n%2==0){
            evnum++;}
            else{
            odnum++;}
            n=Integer.parseInt(reader.nextLine());
            
        }System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+numCount);
        System.out.println("Average: "+(((double)sum)/numCount));
        System.out.println("Even numbers: "+evnum);
        System.out.println("Odd numbers: "+odnum);
        
            
            
        }
        

    }

