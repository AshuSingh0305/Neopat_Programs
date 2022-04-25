package NEOPAT;

import java.util.Arrays;
import java.util.Scanner;

public class luckIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int L[]= new int[n];
        int L2[]= new int[n];
        int incr=0;
        int incr2=0;
        int val=0;
        int [][] contest = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                val = sc.nextInt();
                contest[i][j]=val;
            }
            if(contest[i][1]==1){
                L[incr]=contest[i][0];
                incr++;
            }else if(contest[i][1]==0){
                L2[incr2]=contest[i][0];
                incr2++;
            }
        }
        Arrays.sort(L);
        int wins= incr-k;
        for(int i=0;i<L.length;i++){
            if(L[i]==0){
            }else{
                L[i]=0-L[i];
                wins--;
            }
            if(wins==0){
                break;
            }
        }
        
        int sum=0;
        for(int i=0;i<L.length;i++){
            sum+=L[i]+L2[i];
        }
        System.out.println(sum);
    }
}
