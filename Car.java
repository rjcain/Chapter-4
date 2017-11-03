
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private String model;
    private int year;
    
    
    public Car(String mdl, int yr)
    {
        model = mdl;
        year = yr;
    }

    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public String age() {
        return "This " + this.model + " came out " + (2017 - this.year) + " year(s) ago.";
    }
    
    public boolean equals(Car otherCar) {
        if(this.model.equals(otherCar.model) && this.year == otherCar.year) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString() {
        return "Model: " + model + "\nYear: " + year;
    }
}
