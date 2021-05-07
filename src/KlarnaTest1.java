import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class KlarnaTest1 {

    public static Menu menu = new Menu();

    public static void main(String[] args) {
        String ingredients = ingredients("Just Desserts,-banana");
        System.out.println(ingredients);
    }


    public static String ingredients(String order) {
        if (order==null || order.isEmpty())
            throw new IllegalArgumentException("Error");
        String[] split = order.split(",");
        for (int i = 1; i < split.length; i++) {
            if (!split[i].contains("-"))
                throw new IllegalArgumentException("Error");
        }
        Pattern pattern = Pattern.compile("[-]");
        String productName = split[0];
        Optional<Product> product = menu.products.stream().filter(f -> f.getName().equals(productName)).findFirst();
        if (!product.isPresent() || product.get().getItems() == null || product.get().getItems().isEmpty())
            throw new IllegalArgumentException("Error");

        Collection collection = new ArrayList<>();
        for (String s : split) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                s = s.substring(1, s.length());
                collection.add(s);
            }

        }
        product.get().getItems().removeAll(collection);
        System.out.println(product.get().getItems().toString());
        String str = product.get().getItems().stream().map(Object::toString)
                .collect(Collectors.joining(","));
        return str;
    }
} 
