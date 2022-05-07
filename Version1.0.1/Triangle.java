import java.util.Scanner;
public class Triangle {
    public static void main(String args[]) {  //主函数
        int a=0,b=0,c=0;                     
        Scanner in = new Scanner(System.in);  
        System.out.println("请输入三个1到200的整数：");
        try {                            //判断输入是否异常
            System.out.println("A:");
            a = in.nextInt();
            System.out.println("B:");
            b = in.nextInt();
            System.out.println("C:");
            c = in.nextInt();
        }catch (Exception e){         //异常处理
            System.out.println("输入范围超限");
            System.exit(0);     //终止程序
        }
        if(a<=0||b<=0||c<=0){         //判断范围是否越界
            System.out.println("输入范围超限");
            System.exit(0);
        }
        if(a>200||b>200||c>200){     
            System.out.println("输入范围超限");
            System.exit(0);
        }
        if(a+b>c&&a+c>b&&c+b>a) {         //判断是否构成三角形
            if(a==b&&a!=c) {              //判断是否构成等腰三角形
                System.out.println("等腰三角形");
            }
            else if(a==b&&a==c) {         //判断是否构成等边三角形
                System.out.println("等边三角形");
            }
            else {                       //构成一般三角形
                System.out.println("一般三角形");
            }
        }
        else {                         //不构成三角形
            System.out.println("无法构成三角形");
        }
    }
}
