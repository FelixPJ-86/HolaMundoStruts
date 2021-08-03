package actionForms;

import java.io.Serializable;

import org.apache.struts.action.ActionForm;


public class InicioActionForms extends ActionForm implements Serializable {

	 private String action = null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
    
    private String apellidos;
    
    public String getAction() {
  return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
}
