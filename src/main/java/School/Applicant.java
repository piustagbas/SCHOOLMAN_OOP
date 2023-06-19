package School;

import Entity.Person;

public class Applicant extends Person {
    private int age;
    private String applicantId;


    public Applicant(String firstName, String lastName, String email, String applicantId, int age) {
        super(firstName, lastName, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.applicantId = applicantId;
        this.age = age;
    }

    public int setAge(int age) {
       return this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getApplicantId() {
        return this.applicantId;
    }
}
