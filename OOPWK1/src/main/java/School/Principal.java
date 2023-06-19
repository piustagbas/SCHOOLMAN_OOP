package School;

public class Principal extends  Staff{
    private int age;


    public Principal(String firstName, String lastName, String email, String position, int age) {
        super(firstName, lastName, email, position, age);
        this.age = age;
    }

    public String expelStudent(Student student) {
        System.out.println("Student"+ student.getName() + student.getName() +student.getName() + "has been expelled" );
        return student.getName();
    }

    public String admitApplicant(Applicant applicant) {
        System.out.println("The Student "+ applicant.getFirstName() + applicant.getLastName() + applicant.getEmail() + " is an accepted applicant" );
        return null;
    }

    public Applicant admitApplicantBasedOnAge(Applicant applicant, int minimumAge) {
        if (applicant.getAge() >= minimumAge) {
            admitApplicant(applicant);
        } else {
            System.out.println("Applicant" + applicant.getFirstName() + applicant.getLastName() + applicant.getEmail() + " has been admitted");
        }
        return applicant;
    }
}
