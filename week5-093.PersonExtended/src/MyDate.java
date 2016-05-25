
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    @Override
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        if (earlier(comparedDate)) {
            MyDate tempDate = new MyDate(this.day, this.month, this.year);
            this.day = comparedDate.day;
            this.month = comparedDate.month;
            this.year = comparedDate.year;

            comparedDate = tempDate;
        }

        int difference = this.year - comparedDate.year;

        if (this.month == comparedDate.month && this.day < comparedDate.day) {
            difference -= 1;
        } else if (this.month < comparedDate.month) {
            difference -= 1;
        }

        return difference;
    }

    public boolean isOlder(MyDate comparedDate) {
        if ((this.month == comparedDate.month && this.day < comparedDate.day)
                || (this.month < comparedDate.month && this.year == comparedDate.year) && this.year == comparedDate.year) {
            return true;
        } else if (this.year < comparedDate.year) {
            return true;
        }       
        
        return false;
        
    }

}
