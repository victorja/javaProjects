
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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
        int myYear = this.year * 360;
        int givenYear = comparedDate.year * 360;
        myYear+= (this.month * 30) + this.day;
        givenYear+= (comparedDate.month * 30) + comparedDate.day;
        
            if(myYear > givenYear)
                return (myYear - givenYear)/360;
            else
                return (givenYear - myYear)/360;
        
    }
    

  
}