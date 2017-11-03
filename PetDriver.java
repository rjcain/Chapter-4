
public class PetDriver
{
    public static void main(String args[]) {
        Pet cat = new Pet("Mittens", "Cat", true);
        
        System.out.println(cat);
        System.out.println("Your pet's name is " + cat.getName());
        if(cat.getAlive() == true) {
            System.out.println(cat.getName() + " is alive");
        }
        else {
            System.out.println(cat.getName() + " is dead");
        }
        
        Pet.example();
        
        System.out.println("Number of pets: " + Pet.numPets);
    }
}
