package ar.edu.udecy.web.inventory.model;

import java.util.List;

public class PredictorStock {
    private String productId;
    private List<Integer> last7DaysSales;

    public PredictorStock() {}

    public PredictorStock(String productId, List<Integer> last7DaysSales) {
        this.productId = productId;
        this.last7DaysSales = last7DaysSales;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public List<Integer> getLast7DaysSales() {
        return last7DaysSales;
    }

    public void setLast7DaysSales(List<Integer> last7DaysSales) {
        this.last7DaysSales = last7DaysSales;
    }
}
