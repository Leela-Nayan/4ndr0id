class Book {
    String title, author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    Book(String title){
        this(title, "Unknown1");
    }


    void getDetails(){
        System.out.println("Title: " + title + ", " + "Written by: " + author);
    }

}

public class constructorchain {
    public static void main(String args []){
        Book b1 = new Book("Test", "Test1");
        Book b2 = new Book("Unknown");
        b1.getDetails();
        b2.getDetails();
    }   
}
