package collectionTask4;


public class Student {
    private String name;
    private String group;
    private String idStudent;

    public Student(String name, String group, String idStudent) {
        this.name = name;
        this.group = group;
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroupNum(String group) {
        this.group = group;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (student.getIdStudent().equals(this.getIdStudent())) System.out.println("Студент с таким id уже существует");

        return getIdStudent() != null ? getIdStudent().equals(student.getIdStudent()) : student.getIdStudent() == null;
    }

    @Override
    public int hashCode() {
        return getIdStudent() != null ? getIdStudent().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "  - " + name + ",  " + group + ",  " + idStudent;
    }
}
