package collectionTask2;

public class Employee {
    private String surname;
    private String name;
    private int age;
    private String gender;
    private String education;
    private String position;
    private String section;

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + getSurname() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", education='" + getEducation() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", section='" + getSection() + '\'' +
                '}';
    }

    public Employee(String surname, String name, int age, String gender, String education, String position, String section) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.position = position;
        this.section = section;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
