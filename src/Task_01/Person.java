package Task_01;

public class Person {

    private final String name;
    private final String surname;
    private int age;
    private String Address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return Address;
    }

    public void setAddress(String city) {
        this.Address = city;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return Address != null;
    }
}
