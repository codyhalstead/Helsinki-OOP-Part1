import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String compare=reverse(text);
        boolean isPalindrome = text.equals(reverse(text));
        return isPalindrome;
    }
        
        public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int i =0;
        String help ="";
        while (i<text.length()){
            i++;
            help+=text.charAt(text.length()-i);

        }return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
