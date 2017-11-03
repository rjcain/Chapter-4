
public class CarDriver
{
   public static void main(String args[]) {
       Car car1 = new Car("Mercedes AMG GT", 2016);
       Car car2 = new Car("Toyota", 1993);
       
       System.out.println(car1);
       System.out.println(car1.age());
       System.out.println(car2);
       System.out.println(car2.age());
       System.out.println("Same car: " + car1.equals(car2));
       
    }
}
