import java.util.Scanner;//登录模块代码
public class Login{//主函数
    public static boolean judgeUsername(String name){      //判断用户名是否合法
        if(name.length()<6||name.length()>10){             //判断用户名长度
            return false;}
        for(int i=0;i<name.length();i++){                  //判断是否有非法字符
            if(name.charAt(i)>='a'&&name.charAt(i)<='z'){
                continue;}
            else if(name.charAt(i)>='A'&&name.charAt(i)<='Z'){
                continue;}
            else if(name.charAt(i)>='0'&&name.charAt(i)<='9'){
                continue;}
            else{
                return false;}
        }
        if(name.charAt(0)>='0'&&name.charAt(0)<='9'){    //判断首字符是否是字母
            return false;}
        return true;
    }
    public static boolean judgePassword(String password){   //判断密码是否合法
        if(password.length()!=6){                           //判断密码长度
            return false;
        }
        for(int i=0;i<6;i++){
            if(password.charAt(i)>='0'&&password.charAt(i)<='9') {      //判断密码字符是否为数字
                continue;
            }
            else{
                return false;
            }
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
        if(judgeUsername(username)==true&&judgePassword(password)==true) {        //调用函数判断用户名和密码是否合法
            System.out.println("合法");
        }
        else {
            System.out.println("不合法");
        }
    }
}