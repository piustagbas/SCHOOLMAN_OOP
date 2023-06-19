package School;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    @Test
    public void testTeach() {
        Teacher teacher = new Teacher("John", "Doe", 10, "john.doe@example.com", "T001");
        teacher.teach();
    }

    @Test
    public void testGetTeacherId() {
        Teacher teacher = new Teacher("Jane", "Smith", 8, "jane.smith@example.com", "T002");

        assertEquals("T002", teacher.getTeacherId());
    }

    @Test
    public void testSetTeacherId() {
        Teacher teacher = new Teacher("James", "Brown", 9, "james.brown@example.com", "T003");

        teacher.setTeacherId("T004");

        assertEquals("T004", teacher.getTeacherId());
    }
}
