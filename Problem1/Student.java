public class Student extends Person{
    //instance variables
    protected String myIdNum;
    protected double myGPA;


    //constructor
    public Student(String name, int age, String gender, String idNum, double gpa){
        super(name, age, gender);

        myIdNum = idNum;
        myGPA = gpa;
    }

    //getters and setters
    public String getIdNum(){
        return myIdNum;
    }

    public void setIdNum(String idNum){
        myIdNum = idNum;
    }

    public double getGPA(){
        return myGPA;
    }

    public void setGPA(double gpa){
        myGPA = gpa;
    }

    //toString
    public String toString() {
        return super.toString() + ", ID:" + myIdNum + ", GPA:" + myGPA;
    }
}

