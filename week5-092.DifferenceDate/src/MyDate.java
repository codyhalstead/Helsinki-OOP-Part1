public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
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
    
    public int differenceInYears(MyDate comparedDate){
        int totald1=this.day+(this.month*30)+(this.year*364);
        int totald2=comparedDate.day+(comparedDate.month*30)+(comparedDate.year*364);
        if(totald1>totald2){
            return (totald1-totald2)/364;
        }else{
            return (totald2-totald1)/364;
        }
    }

}
