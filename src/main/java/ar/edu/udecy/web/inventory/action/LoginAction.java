package ar.edu.udecy.web.inventory.action;

import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("Admin".equals(username) && "Admin123".equals(password)) {
            return mapping.findForward("success");
        } else {
            return mapping.findForward("error");
        }
    }
}
