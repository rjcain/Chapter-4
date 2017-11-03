
public class StudentDriver
{
    public static void main(String args[]) {
       StudentPractice sam = new StudentPractice(1234, "Sam");
       StudentPractice max = new StudentPractice(1234, "Max");
       
       System.out.println("The student's ID number is: " + sam.getID());
       System.out.println(sam.getName());
       System.out.println(max.getName());
    }
}
