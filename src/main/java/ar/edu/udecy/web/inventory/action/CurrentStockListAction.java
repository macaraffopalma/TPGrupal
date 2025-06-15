package ar.edu.udecy.web.inventory.action;

import ar.edu.udecy.web.inventory.dao.CurrentStockDAO;
import ar.edu.udecy.web.inventory.model.CurrentStock;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class CurrentStockListAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
        List<CurrentStock> stockList = new CurrentStockDAO().getAllCurrentStock();
        request.setAttribute("currentStockList", stockList);
        return mapping.findForward("success");
    }
}
