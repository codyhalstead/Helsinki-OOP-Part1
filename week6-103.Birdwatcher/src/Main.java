import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
        Scanner reader=new Scanner(System.in);
        BirdDB DB=new BirdDB();
        String input="";
        
        while(true){
            System.out.println("?");
            input=reader.nextLine();
            if(input.equals("Quit")){
                break;
            }
            else if(input.equals("Add")){
                addBird(reader,DB);
            }
            else if(input.equals("Show")){
                System.out.println("What bird?");
                String Name=reader.nextLine();
                showBird(Name,DB);
            }
            else if(input.equals("Statistics")){
                DB.stats();
            }
            else if(input.equals("Observation")){
                System.out.println("What was observed?");
                String Name=reader.nextLine();
                observeBird(Name,DB);
            }
            else{
                System.out.println("Unknown command!");
            }
        }

        
}
    
    public static void addBird(Scanner reader, BirdDB DB){
        System.out.println("Name: ");
        String name=reader.nextLine();
        System.out.println("Latin Name: ");
        String lname=reader.nextLine();
        DB.addBird(name,lname);
    }
    
    public static void observeBird(String Name, BirdDB DB){
        for(Bird i:DB.birds()){
            if(Name.equals(i.getName())){
                i.observed();
                return;
            }
            
        }
        System.out.println("Is not a bird!");
    }
    
    public static void showBird(String Name, BirdDB DB){
        for(Bird i : DB.birds()){
            if(Name.equals(i.getName())){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
}
