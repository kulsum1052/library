package library.management.system;

public class Magazines extends Book {
    
    private String date;
    private String publisher;
    
    public Magazines( int bookID,String author,String name,double price,String dateOfPurchase,String date, String publisher)
    {
        super(bookID,author,name,price,dateOfPurchase);
        this.date = date ;
        this.publisher = publisher ;
    }
    
     public String getdate()
    {
        return date;
    }
     public String getpublisher()
     {
         return publisher;
     }
      public void setdate(String date)
    {
        this.date= date;
    }
      public void setpublisher(String publisher)
      {
          this.publisher = publisher;
      }
    
       public String borrow_book()
    {
        return null;
    }
      public String return_book()
    {
        return null;
    }
    
}
