
public class Pet
{
    // instance variables - replace the example below with your own
    private String name;
    private String type;
    private boolean alive;
    public static int numPets;
    
    public Pet(String nm, String typ, boolean al) {
        // initialise instance variables
        this.name = nm;
        this.type = typ;
        this.alive = al;
        numPets++;
    }
    
    public static void example() {
        System.out.println("This is static!");
    }
    
    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }
    
    public boolean getAlive() {
        return alive;
    }
    
    public String toString() {
        return "This pet is name: " + this.name;
    }
}
