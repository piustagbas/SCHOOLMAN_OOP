package School;

import junit.framework.AssertionFailedError;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ApplicantTest {

    @Test
    public void testApplicantId() {
        Applicant applicant = new Applicant("Justin", "Richards", "dtfyguh@gmail", "A01232", 18);
        Assertions.assertEquals("A01232",applicant.getApplicantId());
    }

    @Test
    public void testApplicantAge() {
        Applicant applicant = new Applicant("Justin", "Richards", "dtfyguh@gmail", "A01232", 18);
        Assertions.assertEquals(18,applicant.getAge());
        Assertions.assertEquals(18,applicant.setAge(18));
    }

    // Add more test cases for other scenarios
}
