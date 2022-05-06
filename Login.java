import java.util.Scanner;
public class Login{
    public static boolean judgeUsername(String name){
        if(name.length()<6||name.length()>10)
            return false;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)>='a'&&name.charAt(i)<='z')
                continue;
            else if(name.charAt(i)>='A'&&name.charAt(i)<='Z')
                continue;
            else if(name.charAt(i)>='0'&&name.charAt(i)<='9')
                continue;
            else
                return false;
        }
        if(name.charAt(0)>='0'&&name.charAt(0)<='9')
            return false;
        return true;
    }
    public static boolean judgePassword(String password){
        if(password.length()!=6)
            return false;
        for(int i=0;i<6;i++){
            if(password.charAt(i)>='0'&&password.charAt(i)<='9')
                continue;
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String username=new String();
        String password=new String();
        Scanner in = new Scanner(System.in);
        System.out.println("用户名：");
        username=in.next();
        System.out.println("密码：");
        password=in.next();
        if(judgeUsername(username)==true&&judgePassword(password)==true)
            System.out.println("合法");
        else
            System.out.println("不合法");
    }
}