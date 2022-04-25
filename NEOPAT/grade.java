package NEOPAT;

import java.util.Scanner;

public class grade {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String firstname = sc.nextLine();
        String lastName = sc.nextLine();
        int id = sc.nextInt();
        int n = sc.nextInt();
        int [] scores = new int[n];
        for(int i=0;i<n;i++){
            scores[i] = sc.nextInt();
        }
        Student student = new Student(firstname, lastName, id, scores);
        System.out.println("Name: "+lastName+" "+ firstname);
        System.out.println("ID: "+id);
        System.out.println("Grade: "+student.calculate());
    }
}

class Person{

}

class Student extends Person{
    String firstName, lastName;
    int id;
    int [] scores;

    public Student(String firstName, String lastName, int id, int[] scores){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.scores=scores;
    }
    public char calculate(){
        int sum = 0;
        char grade;
        for(int i=0;i<scores.length;i++){
            sum+=scores[i];
        }
        int average = sum/scores.length;
        if(average>=90 && average<=100){
            grade='O';
        }else if(average>=80 && average<=90){
            grade='E';
        }else if(average>=70 && average<=80){
            grade='A';
        }else if(average>=55 && average<=70){
            grade='P';
        }else if(average>=40 && average<=55){
            grade='D';
        }else{
            grade='T';
        }
        return grade;
    }
}
