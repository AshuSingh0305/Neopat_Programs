package NEOPAT;

import java.util.Scanner;

public class LongestLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int current=0;
        int newarr []=new int[n-1];
        for(int i=1;i<n;i++){
            newarr[current] = LCM(arr[current++], arr[i]);
        }
        int max=newarr[0];
        current=0;
        for(int i=1;i<newarr.length;i++){
            if(newarr[current]>newarr[i]){
                max=newarr[current++];
            }else{
                max=newarr[i];
            }
        }
        System.out.println(max);
    }
    public static int LCM(int n, int m){
        if(m>n){
            for(int i=1;i<=n;i++){
                int val=m;
                val=val*i;
                if(val%n==0){
                    return val;
                }
            }
        }else{
            for(int i=1;i<=m;i++){
                int val=n;
                val=val*i;
                if(val%m==0){
                    return val;
                }
            }
        }
        return -1;
    }
}
