package ar.edu.udecy.web.inventory.action;

import ar.edu.udecy.web.inventory.dao.PredictorStockDAO;
import ar.edu.udecy.web.inventory.model.PredictorStock;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class PredictorStockListAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
        List<PredictorStock> predicciones = new PredictorStockDAO().getAllPredictorStockData();
        request.setAttribute("predictorStockList", predicciones);
        return mapping.findForward("success");
    }
}
