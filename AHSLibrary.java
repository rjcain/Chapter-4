

public class AHSLibrary
{
   public static void main() {
       Library ahs = new Library("Acalanes", 3);
       
       Author ray = new Author("Ray Bradbury",68);
       Author will = new Author("William Golding", 56);
       Author ern = new Author("Ernest Hemmenway", 83);
       Book f451 = new Book(ray, "Fahrenheit 451");
       Book lotf = new Book(will, "Lord of the Flies");
       Book sun = new Book(ern, "The Sun Also Rises");
       ahs.setBooks(f451, 0);
       ahs.setBooks(lotf, 1);
       ahs.setBooks(sun, 2);
       
       System.out.println(ahs);
       
    }
}
