// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    String name;
    double score1;
    double score2;
    
    Scanner scan = new Scanner(System.in);
    
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.print("Enter " + name + "'s score for test 1: ");
        score1 = scan.nextDouble();
        System.out.print("Enter " + name + "'s score for test 2: ");
        score2 = scan.nextDouble();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public String getAverage() {
        return "Test Average: " + (score1 + score2)/2.0;
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    public String getName() {
        return name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    public void printName() {
        System.out.print(name);
    }
}