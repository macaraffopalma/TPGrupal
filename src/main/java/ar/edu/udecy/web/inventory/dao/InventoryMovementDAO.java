package ar.edu.udecy.web.inventory.dao;

import ar.edu.udecy.web.inventory.model.InventoryMovement;
import ar.edu.udecy.web.inventory.util.JsonDB;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class InventoryMovementDAO {
    private static final String FILE = "inventory_movements.json";

    public List<InventoryMovement> getAllInventoryMovements() {
        List<InventoryMovement> lista = JsonDB.read(FILE, new TypeToken<List<InventoryMovement>>(){}.getType());
        return lista != null ? lista : new ArrayList<>();
    }

    public void addInventoryMovement(InventoryMovement movement) {
        List<InventoryMovement> lista = getAllInventoryMovements();
        lista.add(movement);
        JsonDB.write(FILE, lista);
    }
}
