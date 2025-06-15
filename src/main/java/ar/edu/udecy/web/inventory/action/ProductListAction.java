package ar.edu.udecy.web.inventory.action;

import ar.edu.udecy.web.inventory.dao.ProductDAO;
import ar.edu.udecy.web.inventory.model.Product;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ProductListAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
        List<Product> productos = new ProductDAO().getAllProducts();
        request.setAttribute("productos", productos);
        return mapping.findForward("success");
    }
}

