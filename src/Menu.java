import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    public Menu() {
        List<String> list = new ArrayList<>();
        String[] array = {"strawberry", "banana", "pineapple", "mango", "peach", "honey"};
        list.addAll(Arrays.asList(array));
        list.sort((e1,e2)->e1.compareTo(e2));
        Product product = new Product("Classic", list);



        List<String> list2 = new ArrayList<>();
        String[] array2 = {"blackberry, blueberry, black currant, grape juice, frozen yogurt"};
        list2.addAll(Arrays.asList(array2));
        list2.sort((e1,e2)->e1.compareTo(e2));
        Product product2 = new Product("Freezie", list2);

        List<String> list3 = new ArrayList<>();
        String[] array3 = {"green apple, lime, avocado, spinach, ice, apple juice"};
        list3.addAll(Arrays.asList(array3));
        list3.sort((e1,e2)->e1.compareTo(e2));
        Product product3 = new Product("Greenie", list3);

        List<String> list4 = new ArrayList<>();
        String[] array4 = {"banana, ice cream, chocolate, peanut, cherry"};
        list4.addAll(Arrays.asList(array4));
        list4.sort((e1,e2)->e1.compareTo(e2));
        Product product4 = new Product("Just Desserts", list4);


        products.add(product);
        products.add(product2);
        products.add(product3);
        products.add(product4);

    }

    List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
