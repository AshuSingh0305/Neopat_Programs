package NEOPAT;
import java.util.*;
class Book {
    int id;
    String name,author,publisher;
    int quantity;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
public class Series1 {
    public static void main(String[] args) {
        ArrayList<Book> al = new ArrayList<>();
        HashSet<Book> set=new HashSet<Book>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Creating Books
        Book [] b = new Book[n];
        for(int i =0 ; i< n ; i++){
            b[i] = new Book();
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String publisher = sc.nextLine();
            String author = sc.nextLine();
            int quantity = sc.nextInt();
            b[i].setId(id);
            b[i].setName(name);
            b[i].setAuthor(author);
            b[i].setPublisher(publisher);
            b[i].setQuantity(quantity);
        }

        for(int i =0 ; i< n ; i++){
            set.add(b[i]);
        }

        al.addAll(set);
        sc.nextLine();
        String input = sc.nextLine();

        Collections.reverse(al);
        for(Book book:al){
            System.out.println(book.id+" "+book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
        }

        for(Book book :set){
            if(book.getName().equals(input)){
                System.out.println(input + " is present in the set");
                break;
            }
        }

    }
}