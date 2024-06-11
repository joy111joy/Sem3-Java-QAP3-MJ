public class Person {
    //instance variables
    protected String myName;
    protected int myAge;
    protected String myGender;

    //constructor
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    //getters an dsetters
    public String getName() {
        return myName;
    }

    public void setName(String name) {
        myName = name;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public String getGender() {
        return myGender;
    }

    public void setGender (String gender) {
        myGender = gender;
    }

    //toString
    public String toString() {
        return myName + ", " + myAge + ", " + myGender;
    }


};