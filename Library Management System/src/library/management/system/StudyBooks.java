package library.management.system;

public class StudyBooks extends Book {
    
    private String subject;
    private String level;
    
    public StudyBooks( int bookID,String author,String name,double price,String dateOfPurchase,String subject, String level)
    {
        super(bookID,author,name, price,dateOfPurchase);
        this.subject = subject ;
        this.level = level ;
    }
    
     public String getsubject()
    {
        return subject;
    }
     public String getlevel()
     {
         return level;
     }
      public void setsubject(String subject)
    {
        this.subject= subject;
    }
      public void setlevel(String level)
      {
          this.level = level;
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


