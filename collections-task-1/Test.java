package collectionTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        label:
        while (true){
            System.out.print("""
                    Select an action
                    1. Add a task
                    2. Print all the tasks
                    3. Delete the task
                    0. Quit""");
            System.out.println();
            String input = sc.nextLine();
            switch (input) {
                case "1" -> {
                    System.out.println("Enter a task to assign");
                    String task = sc.nextLine();
                    list.add(task);
                }
                case "2" -> {
                    int num = 0;
                    System.out.println("Task List:");
                    for (String task : list) {
                        num++;
                        System.out.println(num + ": " + task);
                    }
                    System.out.println();
                }
                case "3" -> {
                    int num = 0;
                    for (String task : list) {
                        num++;
                        System.out.println(num + ": " + task);
                    }
                    System.out.println("Enter a number");
                    String task = sc.nextLine();
                    int in = Integer.parseInt(task);
                    list.remove(in - 1);
                }
                case "0" -> {
                    int num = 0;
                    for (String task : list) {
                        num++;
                        System.out.println(num + ": " + task);
                    }
                    break label;
                }
                default -> System.out.println("Enter a number to take an action, to end an action enter '0'");
            }
        }
    }
}
