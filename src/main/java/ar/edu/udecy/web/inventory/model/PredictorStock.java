package ar.edu.udecy.web.inventory.model;

public class PredictorStock {
    private String productId;
    private String date;
    private int soldUnits;

    public PredictorStock() {}

    public PredictorStock(String productId, String date, int soldUnits) {
        this.productId = productId;
        this.date = date;
        this.soldUnits = soldUnits;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public int getSoldUnits() { return soldUnits; }
    public void setSoldUnits(int soldUnits) { this.soldUnits = soldUnits; }
}
