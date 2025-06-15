package ar.edu.udecy.web.inventory.dao;

import ar.edu.udecy.web.inventory.model.PredictorStock;
import ar.edu.udecy.web.inventory.util.JsonDB;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class PredictorStockDAO {
    private static final String FILE = "predictor_stock.json";

    public List<PredictorStock> getAllPredictorStockData() {
        List<PredictorStock> list = JsonDB.read(FILE, new TypeToken<List<PredictorStock>>(){}.getType());
        return list != null ? list : new ArrayList<>();
    }
}
