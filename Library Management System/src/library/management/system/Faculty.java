
package library.management.system;

public class Faculty extends Member_Record{

    private int employee_ID;

    public Faculty(int member_ID, String name, String dateOfMembership,int no_book_issued,int max_book_issued, String address,String phone_no,String date_of_bookIssued,int employee_ID)
    {
        super(member_ID, name, dateOfMembership, no_book_issued, max_book_issued,  address, phone_no, date_of_bookIssued);
        this. employee_ID = employee_ID;
    }
        
    public int getemployee_ID ()
    {
        return employee_ID;
    }
    public void setemployee_ID(int employee_ID)
    {
        this.employee_ID = employee_ID;
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
