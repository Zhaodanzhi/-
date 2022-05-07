import java.util.Scanner;
public class Date{
    public static boolean isRun(int year) {     //判断输入年份是否是闰年
        if(year%400==0||(year%4==0&&year%100!=0)){
            return true;}
        else{
            return false;}
    }
    public static boolean isApproriate(int year,int month,int day) {  //判断输入的月份和日期是否合法
        if(month<=0&&month>12){
            return false;}
        if(day<=0){
            return false;}
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            if(day>31){
                return false;}
            else{
                return true;}
        }
        if(month==4||month==6||month==9||month==11) {
            if(day>30){
                return false;}
            else{
                return true;}
        }
        if(month==2) {
            if(isRun(year)==true) {
                if(day>29){
                    return false;}
                else{
                    return true;}
            }
            else if(isRun(year)==false) {
                if(day>28){
                    return false;}
                else{
                    return true;}
            }
        }
        return true;
    }
    public static void printf(int year,int month,int day){   //输出年月日
        System.out.println(year+"年"+month+"月"+day+"日");
    }
    public static void calucateNextDay(int year,int month,int day) {      //计算当前日期下一天的函数
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) { //31天的月份的加一天
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
        if(month==4||month==6||month==9||month==11) {  //30天的月份加一天
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
        if(month==2) {    //2月单独判断，考虑闰年情况
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
        if(isApproriate(year,month,day)==true){ //调用函数判断输入是否合法
            calucateNextDay(year,month,day);}   //计算下一天 
        else{                                   //输入不合法
            System.out.println("您输入的日期有误，请重新输入！");}
    }
}
