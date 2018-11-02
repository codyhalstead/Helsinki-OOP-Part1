public class NumberStatistics {
    private int amountOfNumbers;
    private int total;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
    this.amountOfNumbers=0;
    this.total=0;}

    public void addNumber(int number) {
        // code here
        amountOfNumbers++;
        this.total+=number;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
    
    public int sum(){
        return total;
    }
    
    public double average(){
        if(amountOfNumbers==0){
            return 0;
        }else{
            return (total*1.0)/amountOfNumbers;
    }}
}