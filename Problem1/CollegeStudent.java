public class CollegeStudent extends Student {
    //instance variables
    private String major;
    private int year;

    //constructor
    public CollegeStudent (String name, int age, String gender, String idNum, double GPA, String major, int year) {
        super(name, age, gender, idNum, GPA);

        this.major = major;
        this.year = year;
    }

    //getters and setters
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //toString
    public String toString() {
        return super.toString() + ", Major: " + major + ", Year: " + year;
    }


    
}
