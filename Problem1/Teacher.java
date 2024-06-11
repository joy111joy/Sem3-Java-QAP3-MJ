public class Teacher extends Person{
    //instance variables
    private String subject;
    private double salary;

    //constructor
    public Teacher (String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);

        this.subject = subject;
        this.salary = salary;
    }

    //getters and setters
    public String getSubject () {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString 
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: " + salary;
    }
}
