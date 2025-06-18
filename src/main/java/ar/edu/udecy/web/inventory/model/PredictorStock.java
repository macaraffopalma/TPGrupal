package ar.edu.udecy.web.inventory.model;

import java.util.List;

public class PredictorStock {
    private String date;
    private String productId;
    private int unitsSold;
    private double avgSalePrice;
    private boolean promotionActive;
    private String specialEvent;

    public String getDate() {
        return date;
    }

    public int getUnitsSold() {
        return unitsSold;
    }
}
