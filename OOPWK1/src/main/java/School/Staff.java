package School;

import Entity.Person;

public class Staff extends Person {

    String position;
    int age;
    int gradeLevel;



    public Staff(String firstName, String lastName, String email, String position, int age) {
        super(firstName, lastName, email);
        this.position = position;
        this.age = age;
    }

    public Staff(String firstName, String lastName, int gradeLevel, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.email = email;
    }

    public String getPosition() {
        return position;
    }
}
