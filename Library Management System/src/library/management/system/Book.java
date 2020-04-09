
package library.management.system;

public class Book {
    private int bookID;
    private String author;
    private String name;
    private double price;
    private String dateOfPurchase;

    public Book(int bookID,String author,String name,double price,String dateOfPurchase)
    {
        this.bookID = bookID;
        this.author = author;
        this.name = name;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
    }
    public int getbookID()
    {
        return bookID;
    }
     public String getauthor()
    {
        return author;
    }
      public String getname()
    {
        return name;
    }
    public double getprice()
    {
        return price;
    }
    public String getdateOfPurchase()
    {
        return dateOfPurchase;
    }
    public void setbookID(int bookID)
    {
       this.bookID = bookID;
    }
    public void setauthor(String author)
    {
       this.author = author;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void setprice(double price)
    {
        this.price = price;
    }
    public void setdateOfPurchase(String dateOfPurchase)
    {
        this.dateOfPurchase = dateOfPurchase;
    }
    
    public String get_title()
    {
        return null;
    }
    public String get_owner()
    {
        return null;
    }
    public String change_owner()
    {
        return null;
    }
    public void display()
    {
        
    }
}

