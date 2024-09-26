
class student{
    int age;
    private int marks;

    void setmarks(int marks){
        this.marks = marks;
    }

    int getmarks(){
        return this.marks;
    }
}

public class practice {
    public static void main (String[] args)
    {   
        int marks = 100;
        student pr = new student();
        pr.age = 19;
        //pr.marks=100 (Not Possible)
        pr.setmarks(marks);
        System.out.printf("%d",pr.getmarks());
    }
}