import java.util.List;

public class Product {

    public Product(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }

    private String name;
    private List<String> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
} 
