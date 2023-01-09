import java.util.*;

public class Collections {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 1; i < 11; i++) { // Заполнение коллекции последовательностью чисел от 1 до 10
            numbers.add(i);
        }
        System.out.println("numbers = " + numbers);

        ArrayList<String> names = new ArrayList<>();
        names.add(new String("Василий"));
        names.add(new String("Павел"));
        names.add(new String("Андрей"));
        names.add(new String("Алексей"));
        names.add(new String("Антон"));
        names.add(new String("Петр"));
        names.add(new String("Елена"));
        names.add(new String("Евгений"));
        names.add(new String("Марина"));
        names.add(new String("Ольга"));
        System.out.println("names = " + names);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        list.add(numbers.get(i) + " - " + names.get(i));
    }
        System.out.println("list = " + list);

    }
}
