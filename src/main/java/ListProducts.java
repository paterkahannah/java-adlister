import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products{
    private List<Product> products = new ArrayList<>();

    public ListProducts() {
        insert(new Product("Switch pro controller", 69.99));
        insert(new Product("Game to buy", 59.99));
        insert(new Product("Straws", 39.99));
    }

    @Override
    public List<Product> all() {
        return this.products;
    }

    @Override
    public void insert(Product product) {
        this.products.add(product);
    }
}
