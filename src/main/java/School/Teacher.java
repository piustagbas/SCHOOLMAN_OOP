package School;

public class Teacher extends Staff {
  private String teacherId;

  public Teacher(String firstName, String lastName, int gradeLevel, String email, String teacherId) {
    super(firstName, lastName, gradeLevel, email);
    this.teacherId = teacherId;
    this.gradeLevel = gradeLevel;
  }

  public String getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(String teacherId) {
    this.teacherId = teacherId;
  }

  public void teach() {
    // Implement the logic for teaching a course
    System.out.println("Teacher " + getFirstName() + " " + getLastName() + " is teaching a course.");
  }
}
