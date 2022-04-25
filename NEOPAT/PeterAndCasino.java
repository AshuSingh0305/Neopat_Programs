package NEOPAT;

import java.util.*;
public class PeterAndCasino {
    static int count=0;
    static int m1=0;
    static int m2=0;
    static int m3=0;
    static int money = 0; 
    static int vari = 1;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        // turn();
        System.out.print(turn());
    }
    public static int turn(){
        if(money==0){
        }else{
            if(vari == 1){
                m1func();
            }else if(vari == 2){
                m2func();
            }
            else{
                m3func();
            }
        }
        return count;
    }
    public static void m1func(){
        money--;
        count++;
        m1++;
        if(m1==25){
            money+=20;
        }
        vari=2;
        turn();
    }
    public static void m2func(){
        money--;
        count++;
        m2++;
        if(m2==120){
            money+=80;
        }
        vari=3;
        turn();
    }
    public static void m3func(){
        money--;
        count++;
        m3++;
        if(m3==12){
            money+=8;
        }
        vari=1;
        turn();
    }
}
