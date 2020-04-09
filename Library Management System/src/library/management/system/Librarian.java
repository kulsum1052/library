package library.management.system;

public class Librarian extends Person{
    
      private String password;

//public Librarian()
//{}
  public Librarian(String name, String password)
    {
     super(name);   
     this.password = password;
    }
  
    public String getpassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
         this.password = password;
    }
    
    
    public String search_book()
    {
        return null;
    }
    public String verify_member()
    {
        return null;
    }
    public String issue_book()
    {
        return null;
    }
    public String calculate_fine()
    {
        return null;
    }
    public String creat_bill()
    {
        return null;
    }
    public String return_book()
    {
        return null;
    }
    @Override
    public void whoyouare()
    {
       System.out.println("Librarian's Name:"+ this.getname() );
    }
    //Liberian issues Book
    


}
