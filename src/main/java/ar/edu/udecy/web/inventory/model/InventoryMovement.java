package ar.edu.udecy.web.inventory.model;

public class InventoryMovement {
    private String productId;
    private String movementType;
    private String date;
    private int quantity;
    private String source;

    public InventoryMovement() {}

    public InventoryMovement(String productId, String movementType, String date, int quantity, String source) {
        this.productId = productId;
        this.movementType = movementType;
        this.date = date;
        this.quantity = quantity;
        this.source = source;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getMovementType() { return movementType; }
    public void setMovementType(String movementType) { this.movementType = movementType; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
}
