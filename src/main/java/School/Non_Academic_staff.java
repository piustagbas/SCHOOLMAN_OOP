package School;

public class Non_Academic_staff extends Staff{
    private String non_Academic_staffId;
    public Non_Academic_staff(String firstName, String lastName, String email, String position, int age, int gradeLevel) {
        super(firstName, lastName, email, position, age);
    }

    public String getNon_Academic_staffId() {
        return non_Academic_staffId;
    }
}
