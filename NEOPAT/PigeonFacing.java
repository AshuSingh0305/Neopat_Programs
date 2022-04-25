package NEOPAT;

import java.util.Scanner;

public class PigeonFacing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[2*a];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        int i=1;
        int sum=0;
        while(i!=a){
            int temp=gcd(b[i], b[i+2]);
            int temp2=i*temp;
            sum+=temp2;
            i++;
        }
        int temp=gcd(b[0], b[b.length-1]);
        int temp2=i*temp;
        sum+=temp2;
        System.out.println(sum);
    }
    public static int gcd(int n1, int n2){
        int ans=1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                ans = i;
        }
        return ans;
    }
}
