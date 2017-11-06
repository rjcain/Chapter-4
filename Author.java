
public class Author
{
    private String name;
    private int age;
    
    public Author(String nm, int ag) {
       name = nm;
       age = ag;
     }
     
    public String toString() {
        return this.name + ", " + this.age;
    }
}
