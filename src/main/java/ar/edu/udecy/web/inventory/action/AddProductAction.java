package ar.edu.udecy.web.inventory.action;

import ar.edu.udecy.web.inventory.dao.CurrentStockDAO;
import ar.edu.udecy.web.inventory.dao.InventoryMovementDAO;
import ar.edu.udecy.web.inventory.dao.ProductDAO;
import ar.edu.udecy.web.inventory.model.CurrentStock;
import ar.edu.udecy.web.inventory.model.InventoryMovement;
import ar.edu.udecy.web.inventory.model.Product;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddProductAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {

        ProductForm productForm = (ProductForm) form;

        // Crear y guardar producto
        Product product = new Product(
                productForm.getProductId(),
                productForm.getProductName(),
                productForm.getSku(),
                productForm.getUnitOfMeasure(),
                productForm.getCost(),
                productForm.getSalePrice(),
                productForm.getCategory(),
                productForm.getLocation(),
                productForm.isActive(),
                productForm.getStock()
        );

        ProductDAO dao = new ProductDAO();
        dao.addProduct(product);

        // Crear y guardar stock
        String fechaHoy = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        CurrentStock stock = new CurrentStock(
                product.getProductId(),
                product.getStock(),
                fechaHoy,
                product.getCost() * product.getStock()
        );
        CurrentStockDAO stockDAO = new CurrentStockDAO();
        stockDAO.addCurrentStock(stock);

        // Crear y guardar movimiento
        InventoryMovement movement = new InventoryMovement(
                product.getProductId(),
                "Ingreso",
                fechaHoy,
                product.getStock(),
                "Alta inicial"
        );
        InventoryMovementDAO movementDAO = new InventoryMovementDAO();
        movementDAO.addInventoryMovement(movement);

        return mapping.findForward("success");
    }
}
