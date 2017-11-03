
public class StudentPractice
{
    //Instance variables
    private String name;
    private int idNumber;
    private StudentPractice bestFriend;
    
    public StudentPractice(int num, String nm) {
        this.idNumber = num;
        this.name = nm;
    }
    
    public int combineIDNumbers() {
        return this.idNumber + bestFriend.idNumber;
    }
    
    public StudentPractice newStudent(StudentPractice other) {
        StudentPractice temp = new StudentPractice(other.idNumber, this.name);
        return temp;
    }
    
    public int getID() {
        return this.idNumber;
    }
    
    public String getName() {
        return "The student's name is: " + this.name;
    }
}
