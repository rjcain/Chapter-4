
public class FactoryDriver
{
   public static void main() {
       Factory mercedes = new Factory(2000, 50);
       
       Car c = new Car("AMG GT", 2017);
       mercedes.setCar(c,0);
       
       System.out.println(mercedes);
    }
}
