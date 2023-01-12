import java.util.Arrays;

public class AreArraysEqual {
        public static boolean AreArraysEqual (String[] a1, String[] a2)
        {
            if (a1 == a2) {
                return true;
            }

            if (a1 == null || a2 == null) {
                return false;
            }

            int b = a1.length;
            if (b != a2.length) {
                return false;
            }

            for (int i = 0; i < b; i++)
            {
                if (!a1[i].equals(a2[i])) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args)
        {
            String[] a1 = { "A", "B", "C" };
            String[] a2 = { "A", "B", "D" };

            if (AreArraysEqual(a1, a2)) {
                System.out.println("Both arrays are equal");
            }
            else {
                System.out.println("Both arrays are not equal");
            }
        }
    }