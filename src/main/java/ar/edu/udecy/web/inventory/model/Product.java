package ar.edu.udecy.web.inventory.model;

public class Product {
    private String productId;
    private String productName;
    private String sku;
    private String unitOfMeasure;
    private double cost;
    private double salePrice;
    private String category;
    private String location;
    private boolean active;
    private int stock;

    public Product() {}

    public Product(String productId, String productName, String sku, String unitOfMeasure,
                   double cost, double salePrice, String category, String location,
                   boolean active, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.sku = sku;
        this.unitOfMeasure = unitOfMeasure;
        this.cost = cost;
        this.salePrice = salePrice;
        this.category = category;
        this.location = location;
        this.active = active;
        this.stock = stock;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }

    public String getUnitOfMeasure() { return unitOfMeasure; }
    public void setUnitOfMeasure(String unitOfMeasure) { this.unitOfMeasure = unitOfMeasure; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public double getSalePrice() { return salePrice; }
    public void setSalePrice(double salePrice) { this.salePrice = salePrice; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
