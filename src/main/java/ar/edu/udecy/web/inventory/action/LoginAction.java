package ar.edu.udecy.web.inventory.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.*;

public class LoginAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {

        LoginForm loginForm = (LoginForm) form;
        String user = loginForm.getUsername();
        String pass = loginForm.getPassword();

        if ("Admin".equals(user) && "Admin123".equals(pass)) {
            request.getSession().setAttribute("role", "Admin");
            return mapping.findForward("success");
        } else if ("Usu".equals(user) && "Usu123".equals(pass)) {
            request.getSession().setAttribute("role", "Usu");
            return mapping.findForward("success");
        } else if ("Vend".equals(user) && "Vend123".equals(pass)) {
            request.getSession().setAttribute("role", "Vend");
            return mapping.findForward("success");
        } else {
            request.setAttribute("error", "Credenciales incorrectas");
            return mapping.findForward("fail");
        }
    }
}
