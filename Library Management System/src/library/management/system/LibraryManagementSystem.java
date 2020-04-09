
package library.management.system;


public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book b= new Book(1001,"Humayum Ahmed","Debi",120,"5/9/2005");
        System.out.println("name:" + b.getname()+ "\nAuthor:" +b.getauthor()+ "\nPrice:" +b.getprice()+ "\nID:" +b.getID()+"\nPrice:" +b.getdateOfPurchase()+"\n");   
    }
    
}
  