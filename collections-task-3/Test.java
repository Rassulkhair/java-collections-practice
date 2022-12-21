package collectionTask3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneContacts phoneContacts = new PhoneContacts();

        System.out.println("Программа справочник");
        System.out.println("Введите название группы контактов:");

        while (true){
            String groupName = sc.nextLine();
            if (!groupName.equals("нет")){
                PhoneContacts.addGroup(groupName);
                System.out.println("Создать еще одну группу (введите название или введите нет)?");
            } else {
                break;
            }

        }

        while (true){
            System.out.println("Создать контакт (введите наименование и его номер (имя, номер) или введите нет)");
            String nameInput = sc.nextLine();
            if (nameInput.equals("нет")){
                break;
            }
            String[] str = nameInput.split(", ");
            String name = str[0];
            String phoneNum = str[1];

            Contact contact = Contact.createContact(name, phoneNum);
            System.out.println("Укажите группу контактов через пробел");
            String groupName = sc.nextLine();
            String[] groups = groupName.split(" ");
            phoneContacts.addContactToGroup(contact, groups);

        }

        System.out.println("Группы в справочнике:");
        PhoneContacts.printContacts();

        System.out.println("Сортированный список: ");
        phoneContacts.printSortedContacts();
    }
}
