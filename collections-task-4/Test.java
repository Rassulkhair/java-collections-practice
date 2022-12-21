package collectionTask4;


import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите информацию о студенте: ФИО, номер группы, номер студенческого билета");

        while (true) {
            String input = sc.nextLine();
            if ("end".equals(input)){
                System.out.println("Список студентов:");
                break;
            }
            System.out.println("Введите информацию о студенте(для завершение работы пишите 'end')");
            String[] str = input.split(", ");
            String name = str[0];
            String group = str[1];
            String idStudent = str[2];

            Student student = new Student(name, group, idStudent);
            students.add(student);
        }
        for (Student value : students){
            System.out.println(value);
        }
    }
}
