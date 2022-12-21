package collectionTask3;

import java.util.Objects;

public class Contact implements Comparable<Contact> {

    private final String name;
    private final String phoneNum;

    public Contact(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public static Contact createContact(String name, String phoneNum) {
        return new Contact(name, phoneNum);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNum, contact.phoneNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNum);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }


    @Override
    public int compareTo(Contact o) {
        return name.compareTo(getName());
    }
}
