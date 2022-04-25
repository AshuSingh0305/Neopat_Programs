package NEOPAT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PigLatinFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        String str= sc.nextLine();
        String string ="";
        for(char ch: str.toCharArray()){
            if(ch==32){
                list.add(string);
                string= "";
            }else{
                string+=ch;
            }
        }
        list.add(string);
        for(int i=0;i< list.size();i++){
            String temp = (String) list.remove();
            LinkedList list1= new LinkedList();
            for(char ch: temp.toCharArray()){
                list1.add(ch);
            }
            char d =(char) list1.remove();
            if(d=='a'||d=='A'||d=='e'||d=='E'||d=='i'||d=='I'||d=='o'||d=='O'||d=='u'||d=='U') {
                list1.add(d);
                list1.add("a");
                list1.add("y");
            }else{
                list1.add(d);
                list1.add("e");
                list1.add("d");
            }
            StringBuffer stringBuffer=new StringBuffer();
            while (!list1.isEmpty()){
                stringBuffer.append(list1.remove());
            }
            list.add(stringBuffer);
        }
        while (!list.isEmpty()){
            System.out.print(list.remove()+" ");
        }
    }
}
