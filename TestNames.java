import java.util.Scanner;

public class TestNames
{
    public static void main() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("NAME 1:");
        System.out.print("Enter the first name: ");
        String first = scan.next();
        System.out.print("Enter the middle name: ");
        String middle = scan.next();
        System.out.print("Enter the last name: ");
        String last = scan.next();
        Name name1 = new Name(first, middle, last);
        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name1.length());
        
        System.out.println("\nNAME 2:");
        System.out.print("Enter the first name: ");
        first = scan.next();
        System.out.print("Enter the middle name: ");
        middle = scan.next();
        System.out.print("Enter the last name: ");
        last = scan.next();
        Name name2 = new Name(first, middle, last);
        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println(name2.length());
        
        System.out.println("Same name: " + name1.equals(name2));
    }
}
