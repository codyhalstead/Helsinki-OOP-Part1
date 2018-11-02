
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String word1=reader.nextLine();
        System.out.print("Type the second word: ");
        String word2=reader.nextLine();
        String is= "";
        if (word1.indexOf(word2)==-1){
            is= "is not";
        }else{
            is="is";
        }
        System.out.println("The word '"+word2+"' "+is+" found in the word '"+word1+"'.");
        
    }
}
