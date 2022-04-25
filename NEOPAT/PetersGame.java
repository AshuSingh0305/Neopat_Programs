package NEOPAT;

import java.util.Scanner;

public class PetersGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count0=0;
        int count1=0;
        char[] arr = str.toCharArray();
        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]=='1')
                count1++;
            else
                count0++;
            if(count0==10||count1==10){
                break;
            }
            if(count0==11){
                break;
            }
            if(count1==11){
                break;
            }
        }
        int win=0;
        if(count0==count1){
            for(i=i+1;i< arr.length;i++){
                if(arr[win]==arr[i]){
                    if(arr[i]==1){
                        System.out.print("Win");
                    }else{
                        System.out.print("Lose");
                    }
                }
                win++;
            }
        }else{
            if(count0>count1){
                System.out.print("Lose");
            }else{
                System.out.print("Win");
            }
        }
    }
}
