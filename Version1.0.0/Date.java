import java.util.Scanner;
public class Date{
    public static boolean isRun(int year) {
        if(year%400==0||(year%4==0&&year%100!=0))
            return true;
        else
            return false;
    }
    public static boolean isApproriate(int year,int month,int day) {
        if(month<=0&&month>12)
            return false;
        if(day<=0)
            return false;
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            if(day>31)
                return false;
            else
                return true;
        }
        if(month==4||month==6||month==9||month==11) {
            if(day>30)
                return false;
            else
                return true;
        }
        if(month==2) {
            if(isRun(year)==true) {
                if(day>29)
                    return false;
                else
                    return true;
            }
            else if(isRun(year)==false) {
                if(day>28)
                    return false;
                else
                    return true;
            }
        }
        return true;
    }
    public static void printf(int year,int month,int day){
        System.out.println(year+"年"+month+"月"+day+"日");
    }
    public static void calucateNextDay(int year,int month,int day) {
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            if(day<=30) {
                day+=1;
            }
            else if(day==31&&month<12) {
                day=1;
                month++;
            }
            else if(day==31&&month==12) {
                year++;
                month=1;
                day=1;
            }
            printf(year,month,day);
            return;
        }
        if(month==4||month==6||month==9||month==11) {
            if(day<=29) {
                day++;
            }
            else if(day==30) {
                day=1;
                month++;
            }
            printf(year,month,day);
            return;
        }
        if(month==2) {
            if(isRun(year)==true&&day<=28) {
                day++;
            }
            else if(isRun(year)==true&&day==29) {
                month++;
                day=1;
            }
            else if(isRun(year)==false&&day<=27) {
                day++;
            }
            else if(isRun(year)==false&&day==28) {
                day=1;
                month++;
            }
            printf(year,month,day);
            return;
        }

    }

    public static void main(String args[]) {
        int month,day,year;
        Scanner in = new Scanner(System.in);
        System.out.println("请分别输入年、月、日：");
        System.out.println("年：");
        year=in.nextInt();
        System.out.println("月：");
        month=in.nextInt();
        System.out.println("日：");
        day=in.nextInt();
        if(isApproriate(year,month,day)==true)
            calucateNextDay(year,month,day);
        else
            System.out.println("您输入的日期有误，请重新输入！");
    }
}
