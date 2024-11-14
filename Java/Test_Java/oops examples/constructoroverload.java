class Book {
    String title, author;

    Book(String t, String a){
        title = t;
        author = a;
    }

    Book(String t){
        title = t;
        author = "Unknown1";
    }


    void getDetails(){
        System.out.println("Title: " + title + ", " + "Written by: " + author);
    }

}

public class constructoroverload {
    public static void main(String args []){
        Book b1 = new Book("Test", "Test1");
        Book b2 = new Book("Unknown");
        b1.getDetails();
        b2.getDetails();
    }   
}



