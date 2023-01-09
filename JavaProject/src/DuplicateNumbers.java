import java.util.*;

public class DuplicateNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        Random random = new Random();
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(50));
        }

        for (int x : numbers) {
            if (list.containsKey(x)) {
                list.put(x, (list.get(x) + 1));
            } else list.put(x, 1);
        }
        list.forEach((keynumber, count) -> System.out.println("key number " + keynumber + " repeats " + count + " times"));
    }
}







