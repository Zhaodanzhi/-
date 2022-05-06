import java.util.Scanner;
public class Triangle {
    public static void main(String args[]) {
        int a=0,b=0,c=0;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入三个1到200的整数：");
       try {
           System.out.println("A:");
           a = in.nextInt();
           System.out.println("B:");
           b = in.nextInt();
           System.out.println("C:");
           c = in.nextInt();
       }catch (Exception e){
           System.out.println("输入范围超限");
           System.exit(0);
       }
       if(a<=0||b<=0||c<=0){
           System.out.println("输入范围超限");
           System.exit(0);
       }
       if(a>200||b>200||c>200){
           System.out.println("输入范围超限");
           System.exit(0);
       }
        if(a+b>c&&a+c>b&&c+b>a) {
            if(a==b&&a!=c) {
                System.out.println("等腰三角形");
            }
            else if(a==b&&a==c) {
                System.out.println("等边三角形");
            }
            else
                System.out.println("一般三角形");
        }
        else
            System.out.println("无法构成三角形");
    }
}
