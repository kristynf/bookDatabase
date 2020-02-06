import java.util.Scanner;

public class Main {


//    public String getBook(String SKU) {
//
//
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        BookDB database = new BookDB();

        System.out.println("Please enter the SKU of the book you're looking for: ");
        String input = sc.nextLine();
//        database.bookReturn(input);
        BookDB database = new BookDB(input);

    }

}
/*
Next, you'll add an overloaded constructor and a method.
An overloaded constructor is a constructor that takes one or more parameters. You can create multiple constructors as long as the parameter types and counts are unique.
Create a constructor  in the BookDB  class that takes a SKU and populates the private member variables. The constructor by default will return the appropriate BookDB object when it is called.
        You do not need to include a return statement.

Next, create a method in your Book class called getDisplayText(). It takes no parameters. When called it returns a string containing the author, title and description.
Do not use System.out.print() in your class. Simply return the string and let the calling class handle the print statements.
You can use this method to print your book information to the console or a file or a web page.*/
