package ar.edu.udecy.web.inventory.model;

public class CurrentStock {
    private String productId;
    private int quantity;
    private String lastUpdated;
    private double totalInventoryCost;

    public CurrentStock() {}

    public CurrentStock(String productId, int quantity, String lastUpdated, double totalInventoryCost) {
        this.productId = productId;
        this.quantity = quantity;
        this.lastUpdated = lastUpdated;
        this.totalInventoryCost = totalInventoryCost;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(String lastUpdated) { this.lastUpdated = lastUpdated; }

    public double getTotalInventoryCost() { return totalInventoryCost; }
    public void setTotalInventoryCost(double totalInventoryCost) { this.totalInventoryCost = totalInventoryCost; }
}
