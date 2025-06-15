package ar.edu.udecy.web.inventory.dao;

import ar.edu.udecy.web.inventory.model.CurrentStock;
import ar.edu.udecy.web.inventory.util.JsonDB;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class CurrentStockDAO {
    private static final String FILE = "current_stock.json";

    public List<CurrentStock> getAllCurrentStock() {
        List<CurrentStock> lista = JsonDB.read(FILE, new TypeToken<List<CurrentStock>>(){}.getType());
        return lista != null ? lista : new ArrayList<>();
    }

    public void addCurrentStock(CurrentStock stock) {
        List<CurrentStock> lista = getAllCurrentStock();
        lista.add(stock);
        JsonDB.write(FILE, lista);
    }
}

