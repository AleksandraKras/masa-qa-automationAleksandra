public class Homework_lesson_03 {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("Result:" + result);

        int a = 5;
        int b = 8;
        int resultfora = a-- - --a + ++a + a++ + a;
        int resultforb = ++b - b++ + ++b - --b;
        System.out.println("Result for a = " + resultfora);
        System.out.println("Result for b = " + resultforb);

        int x = 10;
        int y = 12;
        int z = 3;


        x += y - x++ * z;
        System.out.println("Outcome1:" + x);

        z = --x - y * 5;
        System.out.println("Outcome2:" + z);

        y /= x + 5 % z;
        System.out.println("Outcome3:" + y);

        z = x++ + y * 5;
        System.out.println("Outcome4:" + z);

        x = y - x++ * z;
        System.out.println("Outcome5:" + x);
        
    }
}
