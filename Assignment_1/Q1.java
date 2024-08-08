//Inheritance Example in Java

// Parent Class
class FormatType {
    private String name;
    private int overs;
    
    public FormatType(String name, int overs) {
        this.name = name;
        this.overs = overs;
    }
    
    public void displayInfo() {
        System.out.println("Format: " + name);
        System.out.println("Number of overs: " + overs);
    }
}

// Child Class 1
class TestMatch extends FormatType {
    private String test1;
    
    public TestMatch(String name, int overs, String test1) {
        super(name, overs);
        this.test1=test1;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("No1 Team : " + test1 + "\n");
    }
}

// Child Class 2
class ODIMatch extends FormatType {
    private String odi1;
    
    public ODIMatch(String name, int overs, String odi1) {
        super(name, overs);
        this.odi1 = odi1;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("No1 Team : " + odi1 + "\n");
    }
}

// Child Class 3
class T20Match extends FormatType {
    private String t201;
    
    public T20Match(String name, int overs, String t201) {
        super(name, overs);
        this.t201 = t201;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("No1 Team : " + t201 + "\n");
    }
}

//Main
public class Q1 {
    public static void main(String[] args) {
        TestMatch testMatch = new TestMatch("Test", 450, "Australia");
        ODIMatch odiMatch = new ODIMatch("ODI", 50, "India");
        T20Match t20Match = new T20Match("T20", 20, "India");
        
        System.out.println("Format-wise Statistics :\n");
        testMatch.displayInfo();
        odiMatch.displayInfo();
        t20Match.displayInfo();
    }
}