public class Average {
    public static void main(String[] args) {
        double sum = 0;

        for (double i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum/(100-1+1));
    }
}
