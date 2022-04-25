package NEOPAT;

import java.util.Scanner;
class User{
    String name,mobile,username,password;

    // public String getName() {
    //     return name;
    // }

    public void setName(String name) {
        this.name = name;
    }

    // public String getMobile() {
    //     return mobile;
    // }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // public String getUsername() {
    //     return username;
    // }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
public class PasswordCorrectness {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);   
        User user = new User();
        user.setName(sc.nextLine());
        user.setMobile(sc.nextLine());
        user.setUsername(sc.nextLine());
        user.setPassword(sc.nextLine());
        validate(user);
    }

    private static void validate(User user) {
        String password = user.getPassword();
        int countnum=0,countsp=0;
        int valu=0;
        if(password.length() < 10 || password.length()>20){
            valu++;
            System.out.print("java.lang.Exception: Should be minimum of 10 characters and maximum of 20 characters");
        } 
        for(int i=0;i<password.length();i++){
            char var = password.charAt(i);
            if(var>='0' && var<='9'){
                countnum++;
            }
            if(var =='!'|| var=='@' || var=='#' || var=='$' || var=='%' || var=='^' || var=='&' || var=='*'){
                countsp++;
            }
        }
        if(countnum==0){
            valu++;
            System.out.print("java.lang.Exception: Should contain at least one digit");
        }
        if(countsp==0){
            valu++;
            System.out.print("java.lang.Exception: It should contain at least one special character");
        }
        if(valu==0){
            System.out.print("Valid Password");
        }
    }
}
