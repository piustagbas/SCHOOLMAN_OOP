package School;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testGetName() {
        // Create a student
        Student student = new Student("Alice", 15, "10th Grade");

        // Test the getName() method
        String name = student.getName();
        Assertions.assertEquals("Alice", name);
    }

    @Test
    public void testGetAge() {
        // Create a student
        Student student = new Student("Bob", 16, "11th Grade");

        // Test the getAge() method
        int age = student.getAge();
        Assertions.assertEquals(16, age);
    }

    @Test
    public void testGetGradeLevel() {
        // Create a student
        Student student = new Student("Eve", 14, "9th Grade");

        // Test the getGradeLevel() method
        String gradeLevel = student.getGradeLevel();
        Assertions.assertEquals("9th Grade", gradeLevel);
    }

    @Test
    public void testSetGradeLevel() {
        // Create a student
        Student student = new Student("Carol", 17, "12th Grade");

        // Set a new grade level
        student.setGradeLevel("College");

        // Test the getGradeLevel() method after setting the new grade level
        String updatedGradeLevel = student.getGradeLevel();
        Assertions.assertEquals("College", updatedGradeLevel);
    }
}
