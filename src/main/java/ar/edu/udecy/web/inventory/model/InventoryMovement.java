package ar.edu.udecy.web.inventory.model;

public class InventoryMovement {
    private String productId;
    private String type;
    private String movementDate;
    private int quantity;
    private String notes;

    public InventoryMovement() {}

    public InventoryMovement(String productId, String type, String movementDate, int quantity, String notes) {
        this.productId = productId;
        this.type = type;
        this.movementDate = movementDate;
        this.quantity = quantity;
        this.notes = notes;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(String movementDate) {
        this.movementDate = movementDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
