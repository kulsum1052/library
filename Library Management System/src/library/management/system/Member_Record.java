
package library.management.system;

public class Member_Record {
    private int member_ID;
    private String name;
    private String dateOfMembership;
    private int no_book_issued;
    private int max_book_issued;
    private String address;
    private String phone_no;
    private String date_of_bookIssued;
    
    public Member_Record(int member_ID, String name, String dateOfMembership,int no_book_issued,int max_book_issued, String address,String phone_no,String date_of_bookIssued)
    {
        this.member_ID = member_ID;
        this.name = name;
        this.dateOfMembership = dateOfMembership;
        this.no_book_issued = no_book_issued;
        this.max_book_issued = max_book_issued;
        this.address = address;
        this.phone_no = phone_no;
        this.date_of_bookIssued = date_of_bookIssued;
    }
        
    
    public int getmember_ID()
    {
        return member_ID;
    }
    public String getname()
    {
        return name;
    }
    public String getdateOfMembership()
    {
        return dateOfMembership;
    }
    public int getno_book_issued()
    {
        return no_book_issued;
    }
    public int getmax_book_issued()
    {
        return max_book_issued;
    }
    public String getaddress()
    {
        return address;
    }
    public String getphone_no()
    {
        return phone_no;
    }
    public String  getdate_of_bookIssued()
    {
        return date_of_bookIssued;
    }
           
    public void setmember_ID(int member_ID)
    {
        this.member_ID = member_ID;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void setdateOfMembership(String dateOfMembership)
    {
        this.dateOfMembership = dateOfMembership;
    }
    public void setno_book_issued(int no_book_issued)
    {
        this.no_book_issued = no_book_issued;
    }
    public void setmax_book_issued(int max_book_issued)
    {
        this.max_book_issued = max_book_issued;
    }
    public void setaddress(String address)
    {
        this.address = address;
    }
    public void setphone_no(String phone_no)
    {
        this.phone_no = phone_no;
    }
    public void setdate_of_bookIssued(String date_of_bookIssued)
    {
        this.date_of_bookIssued = date_of_bookIssued;
    }
      
    public String get_member()
    {
        return null;
    }
    public String pay_bill()
    {
        return null;
    }
    public void display()
    {
        System.out.println("Member Name:"+ this.name+"\nMember ID:"+ this.member_ID+"\nQuantity:"+ this.no_book_issued+"\nIssued Date:"+this.date_of_bookIssued);
    }
    //Member_Record requesting access from class Book
  
 }









