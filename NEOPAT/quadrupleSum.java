package NEOPAT;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class quadrupleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int sum = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int toggle=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int front = j+1;
                if(front>n-1)
                    break;
                int back=n-1;
                int target = sum-arr[i]-arr[j];
                while(arr[front]<arr[back]){
                    toggle=0;
                    if(arr[front]+arr[back]>target){
                        back--;
                        toggle=1;
                    }else if(arr[front]+arr[back]<target){
                        front++;
                        toggle=1;
                    }else{
//                    if(arr[front]+arr[back]==target){
                        stack.push(arr[i]);
                        stack.push(arr[j]);
                        stack.push(arr[front]);
                        stack.push(arr[back]);
                    }
                    while(front<n-1){
                        if((arr[front]==arr[front+1])) {
                            front++;
//                            toggle = 1;
                        }
                        else
                            break;
                    }
                    while (arr[back]==arr[back-1]) {
                        back--;
//                        toggle=1;
                    }
                    if(toggle==1){

                    }else{
                        front++;
                        toggle=1;
                    }

                }
                while(j<n-1&&arr[j]==arr[j+1]){
                    j++;
                }
            }
            while(i<n-1&&arr[i]==arr[i+1]){
                i++;
            }
        }
        Stack<Integer> stack1= new Stack<>();
        while(!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        while(!stack1.isEmpty()){
            int i=1;
            while (i<=4) {
                System.out.print(stack1.pop() + " ");
                i++;
            }
            System.out.print("$");
        }
    }
}
