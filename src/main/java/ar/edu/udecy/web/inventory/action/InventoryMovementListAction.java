package ar.edu.udecy.web.inventory.action;

import ar.edu.udecy.web.inventory.dao.InventoryMovementDAO;
import ar.edu.udecy.web.inventory.model.InventoryMovement;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class InventoryMovementListAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
        List<InventoryMovement> movimientos = new InventoryMovementDAO().getAllInventoryMovements();
        request.setAttribute("inventoryMovementList", movimientos);
        return mapping.findForward("success");
    }
}
