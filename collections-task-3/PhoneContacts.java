package collectionTask3;

import java.util.*;

public class PhoneContacts {
    static List<Contact> contactList = new ArrayList<>();
    private static final Map<String, List<Contact>> groups = new HashMap<>();

    public static void addGroup(String input) {
        if (!groups.containsKey(input)) {
            groups.put(input, new ArrayList<>());
        } else {
            System.out.println("Группа с таким именем уже существует");
        }
    }

    public void addContactToGroup(Contact contact, String[] group) {
        for (String str : group) {
            if (groups.containsKey(str)) {
                groups.get(str).add(contact);
            }
        }
    }

    public static void printContacts() {
        for (Map.Entry<String, List<Contact>> entry : groups.entrySet()) {
            System.out.println("- " + entry.getKey());
            for (Contact contact : entry.getValue()) {
                System.out.println("   имя: " + contact.getName() + ",    " + "номер: " + contact.getPhoneNum());
            }
        }
    }

    public void printSortedContacts() {
        List<Contact> allContacts = new ArrayList<>();
        for (Map.Entry<String, List<Contact>> entry : groups.entrySet()) {
            for (Contact contact : entry.getValue()) {
                if (!allContacts.contains(contact)) {
                    allContacts.add(contact);
                }
            }
        }
        allContacts.sort(Comparator.naturalOrder());
        for (Contact contact : allContacts) {
            System.out.println("   имя: " + contact.getName() + ",   номер: " + contact.getPhoneNum());
        }
    }
}
