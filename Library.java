public class Library
{
    // instance variables - replace the example below with your own
    private String libName;
    private Book[] books;
    
    public Library(String nm, int numBooks)
    {
        // initialise instance variables
        this.libName = nm;
        this.books = new Book[numBooks];
      }
      
    public void setBooks(Book b,int index) {
        books[index] = b;
    }
    
    public String toString() {
        String output = "-" + this.libName.toUpperCase() + " LIBRARY CATALOG-\n\n";
        for (Book b : books) {
            output += b + "\n\n";
        }
        return output;
    }
 }
