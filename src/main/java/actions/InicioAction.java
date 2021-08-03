package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import actionForms.InicioActionForms;
import beans.InicioBean;




public class InicioAction  extends Action {


    public ActionForward execute(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {
		 
    String	falloNombre="false";
    String falloApellidos ="false";
    String estado="exito";
    
		 System.out.println("ejecutado InicioAction");
		 
		 
		 InicioActionForms iniActForm =(InicioActionForms) form;
		 
		 InicioBean inicioBean= new InicioBean();
		 inicioBean.setNombre(iniActForm.getNombre());
		 inicioBean.setApellidos(iniActForm.getApellidos());
		 
		 if(inicioBean.getNombre().isEmpty()){
			 falloNombre="true";
		estado="fallo";
		 } 
		 
		 if(inicioBean.getApellidos().isEmpty()) {
			 
			 falloApellidos="true";
				estado="fallo";
			 
		 }
		 
		 request.setAttribute("inicioBean", inicioBean);
		 request.setAttribute("falloNombre", falloNombre);
		 request.setAttribute("falloApellidos", falloApellidos);
	     return mapping.findForward(estado);
		 
		 
	 }
}
