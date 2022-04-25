package NEOPAT;

import java.util.Arrays;
import java.util.Scanner;

public class InsomniaCure {

    static Scanner sc = new Scanner(System.in);
    static int k = sc.nextInt();
    static int l = sc.nextInt();
    static int m = sc.nextInt();
    static int n = sc.nextInt();
    static int d = sc.nextInt();
    static int[] arr = new int[d+1];


    public static void main(String[] args) {

        int count=0;

        if(k == 1 || l==1|| n==1|| m==1){
            System.out.println(d);
        }
        else {
            arr = loop(k );
            arr = loop(l);
            arr = loop(m );
            arr = loop(n);

            for(int i =0 ; i < arr.length ; i++){
                if(arr[i]==1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static int [] loop(int limit){
        for(int i =limit ; i < arr.length ; i=i+limit){
            arr[i] = 1;
        }
        return arr;
    }
}