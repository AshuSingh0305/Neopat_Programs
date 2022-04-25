package NEOPAT;

import java.util.Arrays;
import java.util.Scanner;

public class cupcakeMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=n;
        int calories[]=new int[n];
        for(int i=0;i<n;i++){
            calories[i]=sc.nextInt();
        }
        Arrays.sort(calories);
        int sum=0;
        for(int j=0;j<n;j++){
            sum=(int) (sum+(Math.pow(2, j)*calories[a-1]));
            a--;
        }
        System.out.println(sum);
    }
}
