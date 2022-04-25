package NEOPAT;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class BinaryXORDecimal {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0){
            int r = n%2;
            n=n/2;
            list.addFirst(r);
        }
        int arr[]=new int[list.size()];
        int i=0;
        while (!list.isEmpty()){
            arr[i]= (int) list.remove();
            i++;
        }
        for(i=0;i< arr.length;i++){
            if(i==arr.length-1){
                if(arr[i]==1)
                    arr[i]=0;
                else
                    arr[i]=1;
            }else{
                if(arr[i]==arr[i+1])
                    arr[i]=0;
                else
                    arr[i]=1;
            }
        }
        int sum=0;
        int j=arr.length-1;
        for(i=0;i<arr.length;i++){
            sum+=(arr[i]*Math.pow(2, j));
            j--;
        }
        System.out.println(sum);
    }
}
