import java.util.Scanner;

public class Main {


//    public String getBook(String SKU) {
//
//
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookDB database = new BookDB();

        System.out.println("Please enter the SKU of the book you're looking for? ");
        String input = sc.nextLine();
        database.bookReturn(input);

    }

}
