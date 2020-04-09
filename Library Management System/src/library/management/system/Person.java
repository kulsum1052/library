package library.management.system;

public abstract class Person {
    
    private String name; 
    //overload
    public Person()
    {
    }
    public Person(String name)
    {
       this.name = name;
    }
    
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
         this.name = name;
    }
    
    public abstract void whoyouare();
    
    
}
