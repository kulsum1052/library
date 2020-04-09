package library.management.system;

public class Student extends Member_Record{
    
    private int student_ID;
    private String date_of_return;
     
    public Student(int member_ID, String name, String dateOfMembership,int no_book_issued,int max_book_issued, String address,String phone_no,String date_of_bookIssued, int student_ID, String date_of_return)
    {
        super(member_ID, name, dateOfMembership, no_book_issued, max_book_issued,  address, phone_no, date_of_bookIssued);
        this. student_ID = student_ID;
        this.date_of_return = date_of_return;
    }
      
    public int getstudent_ID()
    {
        return student_ID;
    }
    public String getdate_of_return()
    {
        return date_of_return;
    }
    
    public void setstudent_ID(int student_ID)
    {
        this.student_ID = student_ID;
    }
        public void setdate_of_return(String date_of_return)
    {
        this.date_of_return = date_of_return;
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
