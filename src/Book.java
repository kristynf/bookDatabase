public class Book {
    private String SKU;
    private String title;
    private String author;
    private String description;
    private double price;




    public Book() {

    }

    public Book(String SKU, String title, String author, String description, double price) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    //getters and setters for variables
    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getDisplayText(){
        return getTitle() + " " +getAuthor()+" "+ getDescription();

    }

}
