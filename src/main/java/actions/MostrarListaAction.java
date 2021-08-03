package actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import beans.PersonaBean;
import ln.MostrarListaLn;
import ot.PersonaOT;





public class MostrarListaAction extends Action {
    public ActionForward execute(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {

    	
    	 ArrayList<PersonaBean> listaPersonasBean = new ArrayList<PersonaBean>();
    	
    	 MostrarListaLn mostrarListaLn = new MostrarListaLn();
    	 
    	 ArrayList<PersonaOT> listaPersonaOT= mostrarListaLn.obtenerListaPersonas();
    	 
    	
    	 for (PersonaOT personaOT : listaPersonaOT) {
    		 PersonaBean personaBean= new PersonaBean();
    		 personaBean.setNombre(personaOT.getNombre());
    		 personaBean.setApellido1(personaOT.getApellido1());
    		 personaBean.setApellido2(personaOT.getApellido2());
    		 listaPersonasBean.add(personaBean);
		}
    	 
    	 
    	 
    	 request.setAttribute("listaPersonasBean", listaPersonasBean);
    	
    String estado="exito";
	 System.out.println("ejecutado MostrarListaAction");
	     return mapping.findForward(estado);
		 
		 
	 }
}
