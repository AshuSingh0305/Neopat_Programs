package NEOPAT;

import java.util.Scanner;
import java.util.Arrays;

public class HelpThePrince {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [] prince = new char[m];
        char [] queen = new char[m];
        String value = sc.next();
        prince=value.toCharArray();
        char arr[][] = new char[n][m];
        for (int i = 0; i < n; i++) {
            String data = "";
            data = sc.next();
            for (int j = 0; j < m; j++){
                arr[i][j] = data.charAt(j);
            } 
        }
        value = sc.next();
        queen=value.toCharArray();
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                if(i%2==0){
                    if(arr[i][j]=='X'){
                        arr[i][j]='.';
                        if(j==0){
                            arr[i][m-1]='X';
                        }else{
                            arr[i][j-1]='X';
                        }
                        break;
                    }
                }else{
                    if(arr[i][j]=='X'){
                        arr[i][j]='.';
                        if(j==m-1){
                            arr[i][0]='X';
                        }else{
                            arr[i][j+1]='X';
                        }
                        break;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            System.out.print(prince[i]);
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for(int i =0;i<m;i++){
            System.out.print(queen[i]);
        }
    }
}
