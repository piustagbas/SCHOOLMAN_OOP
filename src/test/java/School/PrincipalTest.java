package School;
import School.Student;
import Enum.Role;

import org.junit.Assert;
import org.junit.Test;

import static Enum.Role.APPLICANTS;

public class PrincipalTest {

    @Test
    public void testGettersAndSetters() {
        Principal principal = new Principal("Jane", "Smith", "jane.smith@example.com", "123456", 19);

        Assert.assertEquals("Jane", principal.getFirstName());
        Assert.assertEquals("Smith", principal.getLastName());
        Assert.assertEquals("jane.smith@example.com", principal.getEmail());


        Assert.assertEquals("Jane", principal.getFirstName());
        Assert.assertEquals("Smith", principal.getLastName());
        Assert.assertEquals("jane.smith@example.com", principal.getEmail());
    }

    @Test
    public void testPerformPrincipalDuties() {
        Principal principal = new Principal("John", "Doe", "principal@example.com", "123456", 19);
        Student student = new Student("laurel", 20, "A5");
        Applicant applicant = new Applicant("lasisi ", " john ", " lasisijohn@gmail.com", "A21333", 24);
        String duty1 = principal.expelStudent(student);
        String duty2 = String.valueOf(principal.admitApplicantBasedOnAge(applicant, 19));

//        Assert.assertEquals("Performing Principal Duty 1", duty1);
//        Assert.assertEquals("Performing Principal Duty 2", duty2);
    }
}
