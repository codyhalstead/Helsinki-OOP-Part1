import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random=new Random();
    String options ="abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length=length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i=0;
        String pass="";
        while(i<this.length){
            pass+=options.charAt(random.nextInt(26));
            i++;
            
        }return pass;
    }
}
