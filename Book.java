
public class Book
{
    // instance variables - replace the example below with your own
    private Author bookAuthor;
    private String title;
    
    public Book(Author at, String ttl)
    {
        // initialise instance variables
        bookAuthor = at;
        title = ttl;
    }

    public String toString() {
        return this.title + " by " + bookAuthor;
    }
}
