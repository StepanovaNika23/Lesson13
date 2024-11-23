package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    private final HashMap<String, List<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        lastName = lastName.toLowerCase();
        if (!book.containsKey(lastName)) {
            book.put(lastName, new ArrayList<>());
        }
        book.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        lastName = lastName.toLowerCase();
        return book.get(lastName);
    }


}
