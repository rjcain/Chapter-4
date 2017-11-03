
public class Hat
{
    // instance variables - replace the example below with your own
    private String type;
    private int height;
    private boolean isBig;
    
    public Hat(String typ, int ht, boolean bg)
    {
        // initialise instance variables
        this.type = typ;
        this.height = ht;
        this.isBig = bg;
    }

    public static void example() {
        System.out.println("This is static!");
    }
    
    public String getType() {
        return type;
    }
    
    public int getHeight() {
        return height;
    }
    
    public boolean getIsBig() {
        return isBig;
    }
    
    public String toString() {
        return "This hat is a " + this.type;
    }
}
