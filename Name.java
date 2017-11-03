

public class Name
{
    private String first;
    private String middle;
    private String last;
    
    
    
    public Name(String fst, String mid, String lst) { 
        first = fst;
        middle = mid;
        last = lst;
    }
    
    public String getFirst() {
        return first;
    }
    
    public String getMiddle() {
        return middle;
    }
    
    public String getLast() {
        return last;
    }
    
    public String firstMiddleLast() {
        return first + " " + middle + " " + last;
    }
    
    public String lastFirstMiddle() {
        return last + ", " + first + " " + middle;
    }
    
    public boolean equals(Name otherName) {
        if(this.firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast())) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String initials() {
        return (first.substring(0,1)).toUpperCase() + "." + (middle.substring(0,1)).toUpperCase() + "." + (last.substring(0,1)).toUpperCase();
    }
    
    public int length() {
        return first.length() + middle.length() + last.length();
    }
}
