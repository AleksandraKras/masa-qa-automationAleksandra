import java.util.HashMap;

public class Countries {
    public static void main(String[] args) {
        HashMap<String, String> cityandcountry = new HashMap<>();
        cityandcountry.put("Wellington", "New Zealand");
        cityandcountry.put("Tokio", "Japan");
        cityandcountry.put("London", "Great Britain");
        cityandcountry.put("Moscow", "Russia");
        cityandcountry.put("Kiev", "Ukraine");
        cityandcountry.put("Washington", "USA");
        cityandcountry.put("Jerusalem", "Israel");
        cityandcountry.put("Seoul", "South Korea");
        cityandcountry.put("Berlin", "Germany");
        cityandcountry.put("Helsinki", "Finland");

        System.out.println("HashMap:\n" + cityandcountry);

        if (cityandcountry.containsValue("Finland")) {
            System.out.println("Finland is present on the list");
        }
        if (cityandcountry.containsKey("Helsinki")) {
            System.out.println("Helsinki is present on the list");
        }
    }
}
