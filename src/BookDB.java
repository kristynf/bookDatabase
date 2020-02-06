import java.util.ArrayList;

public class BookDB {
    //poor woman's  db
    private ArrayList<Book> bookDBArrayList;
    // BookDB bookdatabase = new BookDB();


    //default constructor
    public BookDB() {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setSKU("Java1001");
        book1.setTitle("Head First Java");
        book1.setAuthor("Kathy Sierra and Bert Bates");
        book1.setDescription("Easy to read Java workbook");
        book1.setPrice(47.50);
        books.add(book1);

        Book book2 = new Book();
        book2.setSKU("Java1002");
        book2.setTitle("Thinking in Java");
        book2.setAuthor("Bruce Eckel");
        book2.setDescription("Details about Java under the hood");
        book2.setPrice(20.00);
        books.add(book2);

        Book book3 = new Book();
        book3.setSKU("Orcl1003");
        book3.setTitle("OCP: Oracle Certified Professional Java SE");
        book3.setAuthor("Jeanne Boyarsky");
        book3.setDescription("Everything you need to know in one place");
        book3.setPrice(45.00);
        books.add(book3);

        Book book4 = new Book();
        book4.setSKU("Python1004");
        book4.setTitle("Automate the Boring Stuff with Python");
        book4.setAuthor("Al Sweigart");
        book4.setDescription("Fun with Python");
        book4.setPrice(10.50);
        books.add(book4);

        Book book5 = new Book();
        book5.setSKU("Zombie1005");
        book5.setTitle("The Maker's Guide to the Zombie Apocalypse");
        book5.setAuthor("Simon Monk");
        book5.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
        book5.setPrice(16.50);
        books.add(book5);

        Book book6 = new Book();
        book6.setSKU("Rasp1006");
        book6.setTitle("Raspberry Pi Projects for the Evil Genius");
        book6.setAuthor("Donald Norris");
        book6.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
        book6.setPrice(14.75);
        books.add(book6);
        setBookDBArrayList(books);

    }

    public ArrayList<Book> getBookDBArrayList() {
        return bookDBArrayList;
    }
//array list setter
    public void setBookDBArrayList(ArrayList<Book> bookDBArrayList) {
        this.bookDBArrayList = bookDBArrayList;
    }
//array list getter
    public void bookReturn(String SKU) {
        String bookReturn = "";
        for (int i = 0; i < getBookDBArrayList().size(); i++) {

            if (SKU.equals(getBookDBArrayList().get(i).getSKU())) {
                bookReturn = getBookDBArrayList().get(i).getTitle() + " " + getBookDBArrayList().get(i).getAuthor() + " "
                        + getBookDBArrayList().get(i).getDescription() + " " + getBookDBArrayList().get(i).getPrice();
                break;//break statement necessary or it will just go right to else

            } else {
                bookReturn = "No book found";
            }

        }
        System.out.println(bookReturn);// could not use sout and just do return bookReturn and use public String method and use a sout in the when calling from main..
    }
}




//    public String getBook(String SKU) {
//
//
//    }




/*
A book database class will contain a method to return a book object. We haven't exactly learned how to create a database or read/write to files yet.
We're going to use the knowledge we already have to create a class. Our class will simulate a database and return a populated book object.
We'll simulate a database by simply using if or switch statements to look up a book based on SKU.
Later, we'll create a database using Oracle that also returns a book object.

        Our book database will contain several book titles and the SKU code to look one up.

        Your assignment
        Create a class that contains a method that takes one parameter, the SKU, and returns a corresponding book object.
        Use If Statements to populate the instance variables of the Book class and return the populated Book class.

        Your database should contain the following books:

        SKU	Title	Author	Description	Price
        Java1001	Head First Java	Kathy Sierra and Bert Bates	Easy to read Java workbook	47.50
        Java1002	Thinking in Java	Bruce Eckel	Details about Java under the hood	20.00
        Orcl1003	OCP: Oracle Certified Professional Java SE	Jeanne Boyarsky	Everything you need to know in one place	45.00
        Python1004	Automate the Boring Stuff with Python	Al Sweigart	Fun with Python	10.50
        Zombie1005	The Maker's Guide to the Zombie Apocalypse	Simon Monk	Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi	16.50
        Rasp1006	Raspberry Pi Projects for the Evil Genius	Donald Norris	A dozen fiendishly fun projects for the Raspberry Pi!	14.75*/
