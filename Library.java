package week1.day2;

public class Library {
    public void addBook(String bookTitle){
       System.out.println("Book added successfully");
};
   public void issueBook(){
    System.out.println("Book issued successfully");

   }
public static void main(String[] args) {
    Library Book=new Library();
    Book.addBook("Psychology of Money");
    Library Book1=new Library();
    Book1.issueBook();
  
}
}
