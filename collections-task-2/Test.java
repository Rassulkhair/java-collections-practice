package collectionTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        while (true) {
            System.out.println("Хотите добавить сотрудника?");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("да")) {
                System.out.println("Введите информацию о сотруднике");
                System.out.println("Введите фамилию сотрудника");
                String surname = sc.next();
                System.out.println("Введите имю сотрудника");
                String name = sc.next();
                System.out.println("Введите возраст сотрудника");
                int age = sc.nextInt();
                System.out.println("Введите пол сотрудника");
                String gender = sc.next();
                System.out.println("Введите образование сотрудника");
                String education = sc.next();
                System.out.println("Введите должность сотрудника");
                String position = sc.next();
                System.out.println("Введите отдел сотрудника");
                sc.nextLine();
                String section = sc.nextLine();

                Employee emp = new Employee(surname, name, age, gender, education, position, section);
                employeeList.add(emp);
            }
            System.out.println("Если хотите закончить ввод данных, введите end, иначе нажмите 'enter'.");
            String input = sc.nextLine();
            for (Employee employee: employeeList) {
                System.out.println(employee);
            }

            if (input.equals("end")) {
                break;
            }
            System.out.println("Введите фамилию сотрудника, для которого хотите изменить данные");
            String surnameToChange = sc.nextLine();
            System.out.println("Введите имю сотрудника");
            String nameToChange = sc.nextLine();
            int empIndex = searchByName(surnameToChange, nameToChange, employeeList);
            if (empIndex != -1) {
                System.out.println("Меняем фамилию сотрудника?");
                String ansSurname = sc.nextLine();
                if (ansSurname.equalsIgnoreCase("да")) {
                    System.out.println("Введите фамилию сотрудника");
                    String inputSurname = sc.nextLine();
                    employeeList.get(empIndex).setSurname(inputSurname);
                }
                System.out.println("Меняем имя сотрудника?");
                String ansName = sc.nextLine();
                if (ansName.equalsIgnoreCase("да")) {
                    System.out.println("Введите имю сотрудника");
                    String inputName = sc.nextLine();
                    employeeList.get(empIndex).setName(inputName);
                }
                System.out.println("Меняем возраст сотрудника?");
                String ansAge = sc.nextLine();
                if (ansAge.equalsIgnoreCase("да")) {
                    System.out.println("Введите возраст сотрудника");
                    String inputAge = sc.nextLine();
                    int parseAge = Integer.parseInt(inputAge);
                    employeeList.get(empIndex).setAge(parseAge);
                }
                System.out.println("Меняем пол сотрудника?");
                String ansGen = sc.nextLine();
                if (ansGen.equalsIgnoreCase("да")) {
                    System.out.println("Введите пол сотрудника");
                    String inputGender = sc.nextLine();
                    employeeList.get(empIndex).setGender(inputGender);
                }
                System.out.println("Меняем образавание сотрудника?");
                String ansEdu = sc.nextLine();
                if (ansEdu.equalsIgnoreCase("да")) {
                    System.out.println("Введите образование сотрудника");
                    String inputEducation = sc.nextLine();
                    employeeList.get(empIndex).setEducation(inputEducation);
                }
                System.out.println("Меняем должность сотрудника?");
                String ansPos = sc.nextLine();
                if (ansPos.equalsIgnoreCase("да")) {
                    System.out.println("Введите должность сотрудника");
                    String inputPosition = sc.nextLine();
                    employeeList.get(empIndex).setPosition(inputPosition);
                }
                System.out.println("Меняем отдел сотрудника?");
                String ansSection = sc.nextLine();
                if (ansSection.equalsIgnoreCase("да")) {
                    System.out.println("Введите отдел сотрудника");
                    String inputSection = sc.nextLine();
                    employeeList.get(empIndex).setSection(inputSection);
                }
                for (Employee employee: employeeList) {
                    System.out.println(employee);
                }
            }
        }
    }


    static int searchByName(String surname, String name, List<Employee> employeeList) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            if (employee.getSurname().equals(surname) || employee.getName().equals(name)) {
                return i;
            }
        }
        System.out.println("Сотрудник не найден.");
        return -1;
    }
}
