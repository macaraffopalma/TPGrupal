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

        // Crear nuevo producto
        Product producto = new Product();
        producto.setProductId(productForm.getProductId());
        producto.setProductName(productForm.getProductName());
        producto.setSku(productForm.getSku());
        producto.setUnitOfMeasure(productForm.getUnitOfMeasure());
        producto.setCost(productForm.getCost());
        producto.setSalePrice(productForm.getSalePrice());
        producto.setCategory(productForm.getCategory());
        producto.setLocation(productForm.getLocation());
        producto.setActive(productForm.isActive());
        producto.setStock(productForm.getStock());

        // Guardar en JSON productos
        ProductDAO productDAO = new ProductDAO();
        productDAO.addProduct(producto);

        // Crear y guardar stock inicial
        CurrentStock stock = new CurrentStock(
                producto.getProductId(),
                producto.getStock(),
                producto.getLocation(),
                producto.getCost()
        );
        CurrentStockDAO stockDAO = new CurrentStockDAO();
        stockDAO.addCurrentStock(stock);

        // Crear y guardar movimiento de inventario inicial
        String fechaHoy = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        InventoryMovement movimiento = new InventoryMovement(
                producto.getProductId(),
                "INGRESO",
                fechaHoy,
                producto.getStock(),
                "Alta de producto"
        );
        InventoryMovementDAO movementDAO = new InventoryMovementDAO();
        movementDAO.addInventoryMovement(movimiento);

        return mapping.findForward("success");
    }
}
