
public class StudentDriver
{
    public static void main(String args[]) {
       Student sam = new Student(1234, "Sam");
       Student max = new Student(1234, "Max");
       
       System.out.println("The student's ID number is: " + sam.getID());
       System.out.println(sam.getName());
       System.out.println(max.getName());
    }
}
