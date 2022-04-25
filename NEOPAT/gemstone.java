package NEOPAT;

import java.util.Scanner;

public class gemstone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String [] array = new String[n];
        for(int i=0 ; i< n ; i++){
            array[i] = sc.next();
        }
        int [] fin = new int [128];
        int [] newasci = new int[128];
        for(int i =0 ; i< n ; i++){
            for(char ch: array[i].toCharArray()){
                if(fin[ch] == 0){
                    fin[ch]++;
                }
            }
            for(int j=0 ; j< 128 ; j++){
                if(fin[j]==1){
                    newasci[j]++;
                    fin[j]=0;
                }
            }
        }

        int count=0;
        for(int i=0 ; i< 128 ; i++){
            if(newasci[i]== n){
                count++;
            }
        }
        System.out.println(count);
    }
}