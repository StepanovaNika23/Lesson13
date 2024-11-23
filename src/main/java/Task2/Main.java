package Task2;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "123-45-67");
        phonebook.add("Petrov", "987-65-43");
        phonebook.add("Ivanov", "555-12-12");
        phonebook.add("Sidorov", "111-22-33");
        phonebook.add("ivanov", "999-88-77");


        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Petrov"));
        System.out.println(phonebook.get("Sidorov"));
        System.out.println(phonebook.get("Stepanov"));

    }
}
