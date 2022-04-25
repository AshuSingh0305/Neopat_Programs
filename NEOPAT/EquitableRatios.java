package NEOPAT;

import java.util.Scanner;

public class EquitableRatios {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int y=0;
        int [] arr = new int[n];
        for(int i=0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i < n ; i++){
            if(isOdd(arr[i])){
                if(i == n-1) {
                    y = 1;
                    break;
                }
                arr[i]+=1;
                arr[i+1]+=1;
                count++;
            }
        }
        if(y==1){
            System.out.println("NO");
        }else {
            System.out.println(count * 2);
        }

    }
    public static boolean isOdd(int value){
        return value%2==1;
    }
}