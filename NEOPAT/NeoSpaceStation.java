package NEOPAT;

import java.util.Arrays;
import java.util.Scanner;

public class NeoSpaceStation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[m];
        int max[] = new int[m];
        int maxindex=0;
        int tempmax=0;
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int temp=arr[j]-i;
                if(temp<0){
                    temp=0-temp;
                }
                max[maxindex]=temp;
                maxindex++;
            }
            Arrays.sort(max);
            if(tempmax<max[0]){
                tempmax=max[0];
            }
            maxindex=0;
        }   
        System.out.println(tempmax); 
    }   
}
