
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.print("studentnumber: ");
            String number=reader.nextLine();
            list.add(new Student(name,number));
        }
   
        System.out.println("");
        for(Student i:list){
            System.out.println(i);
        }
        System.out.println("");
        System.out.print("Give search term: ");
        String search=reader.nextLine();
        System.out.println("Result:");
        
        for(Student i:list){
            if(i.getName().contains(search)){
                System.out.println(i);
            }
        }
    }   
        
}
  