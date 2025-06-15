package ar.edu.udecy.web.inventory.dao;

import ar.edu.udecy.web.inventory.model.Product;
import ar.edu.udecy.web.inventory.util.JsonDB;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private static final String FILE = "products.json";

    public List<Product> getAllProducts() {
        List<Product> list = JsonDB.read(FILE, new TypeToken<List<Product>>(){}.getType());
        return list != null ? list : new ArrayList<>();
    }

    public void addProduct(Product product) {
        List<Product> list = getAllProducts();
        list.add(product);
        JsonDB.write(FILE, list);
    }
}
