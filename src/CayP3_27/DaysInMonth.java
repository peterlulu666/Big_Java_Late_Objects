package CayP3_27;

public class DaysInMonth {
    private int month;

    public DaysInMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

//    public void checkDays() {
//        if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
//            System.out.println("30 days");
//            return;
//        }
//
//        else if (this.month == 2){
//            System.out.println("28 or 29 days");
//            return;
//        }
//        else {
//            System.out.println("31 days");
//            return;
//        }
//    }

    public void checkDays(){
        boolean feb = (this.month == 2);
        boolean apr = (this.month == 4);
        boolean jun = (this.month == 6);
        boolean sep = (this.month == 9);
        boolean nov = (this.month == 11);

        if (apr || jun || sep || nov){
            System.out.println("30 days");
        }
        else if (feb){
            System.out.println("28 or 29 days");
        }
        else {
            System.out.println("31 days");
        }
    }
}
