import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.random = new Random();
        
        this.drawNumbers();
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        int i = 0, number;
        numbers.clear();
        while (i < 7) {
            number = this.random.nextInt(39) + 1;
            if (!containsNumber(number)) {
                this.numbers.add(number);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        for (int value : this.numbers) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }
}