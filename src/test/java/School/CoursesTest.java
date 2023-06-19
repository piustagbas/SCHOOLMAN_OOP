package School;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoursesTest {

    @Test
    public void testCourses() {
        // Create a teacher
        Teacher teacher = new Teacher("Johnny", "lukas", 1, "English Teacher", "23");
        Teacher newInstructor = new Teacher("Johnny", "lukas", 1, "English Teacher", "23");
        // Create a course
        Courses course = new Courses("C001", "Mathematics", 3, teacher);

        // Test getters
        Assertions.assertEquals("C001", course.getCourseId());
        Assertions.assertEquals("Mathematics", course.getCourseName());
        Assertions.assertEquals(3, course.getCreditHours());
        Assertions.assertEquals(teacher, course.getInstructor());

        // Test setters
        course.setCourseId("C002");
        course.setCourseName("English");
        course.setCreditHours(4);
        course.setInstructor(course.getInstructor());

        Assertions.assertEquals("C002", course.getCourseId());
        Assertions.assertEquals("English", course.getCourseName());
        Assertions.assertEquals(4, course.getCreditHours());
//        Assertions.assertEquals(newInstructor, course.setInstructor());
    }
}
