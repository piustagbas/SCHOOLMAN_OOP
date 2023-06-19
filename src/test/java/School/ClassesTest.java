package School;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ClassesTest {
    private Classes classes;
    private Teacher teacher;
    private Student student1;

    @BeforeEach
    public void setup() {
        teacher = new Teacher("John", "Doe", 1, "Biology Teacher", "55");
        classes = new Classes("Math", teacher);
    }

    @Test
    public void testGetClassName() {
        String className = classes.getClassName();
        Assertions.assertEquals("Math", className);
    }

    @Test
    public void testGetTeacher() {
        Teacher retrievedTeacher = classes.getTeacher();
        Assertions.assertEquals(teacher, retrievedTeacher);
    }

    @Test
    public void testSetTeacher() {
        teacher = new Teacher("John", "Doe", 1, "johndoe@gmail.com", "55");
        Teacher retrievedTeacher = classes.getTeacher();
    }

    @Test
    public void testAddStudent() {
        classes.addStudent(student1);
        List<Student> students = classes.getStudents();
        Assertions.assertTrue(students.contains(student1));
    }

    @Test
    public void testRemoveStudent() {
        classes.addStudent(student1);
        classes.removeStudent(student1);
        List<Student> students = classes.getStudents();
        Assertions.assertFalse(students.contains(student1));
    }
}
