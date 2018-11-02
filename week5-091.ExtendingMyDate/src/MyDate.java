
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        this.day+=1;
        if(day>30){
            this.day=1;
            this.month+=1;
            if(month>12){
                this.month=1;
                this.year+=1;
            }
        }
    }
    
    public void advance(int number){
        while(number>0){
            advance();
            number--;
        }
    }
    
    public MyDate afterNumberOfDays(int days){
        MyDate clone = new MyDate(this.day,this.month,this.year);
        clone.advance(days);
        return clone;
    }

}