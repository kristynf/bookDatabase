import java.util.ArrayList;

public class BookDB {
    //poor woman's  db
    private ArrayList<Book> bookDBArrayList;
    // BookDB bookdatabase = new BookDB();


    public BookDB(ArrayList<Book> bookDBArrayList) {
        this.bookDBArrayList = bookDBArrayList;
    }

    public BookDB (String SKU) {
        BookDB database = new BookDB();
        database.bookReturn(SKU);
    }

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
                bookReturn = getBookDBArrayList().get(i).getDisplayText() ;
                break;//break statement necessary or it will just go right to else

            } else {
                bookReturn = "No book found";
            }

        }
        System.out.println(bookReturn);// could not use sout and just do return bookReturn and use public String method and use a sout in the when calling from main..
    }


}

