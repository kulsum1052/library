package library.management.system;

public class Reader extends Person{
    
    private String books;
    
    //public Reader()
    //{}
    public Reader(String name,String books)
    {
        super(name);
        this.books = books;
    }
    
    
    public String getbooks()
    {
        return books;
    }
    public void setbooks(String books)
    {
         this.books = books;
    }
    
    public String purchase_book()
    {
        return null;
    }
     public String borrow_book()
    {
        return null;
    }
      public String return_book()
    {
        return null;
    }
       public void show_book()
    {
         System.out.println("Book Name:"+this.getbooks());
    }
       @Override
        public void whoyouare()
    {
        System.out.println("Reader Name:"+this.getname() );
    }

    
}

