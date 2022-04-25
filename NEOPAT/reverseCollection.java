package NEOPAT;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseCollection {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        CallLog [] array = new CallLog[n];
        int [] durrationArray  = new int[n];
        for(int i =0 ; i< n ; i++){
            CallLog callLog = new CallLog();
            callLog.dialledNumber = sc.next();
            callLog.duration = sc.nextInt();
            callLog.date = sc.next();
            durrationArray[i] = callLog.duration;
            array[i] = callLog;
        }

        Arrays.sort(durrationArray);


        for(int i =0 ; i < n ; i++){
            int duration = durrationArray[i];
            for(int j=0 ; j< n ; j++){
                CallLog callLog = array[j];
                if(duration == callLog.duration ){
                    System.out.println("DialledNumber : "+callLog.dialledNumber+", Duration : "+callLog.duration+" Date : "+callLog.date);
                }
            }
        }

    }
}
class CallLog{
    String dialledNumber;
    int duration;
    String date;
}