package actionForms;

import java.io.Serializable;

import org.apache.struts.action.ActionForm;

public class MostrarListaActionForm extends ActionForm implements Serializable {

	 private String action = null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 6493791950535206659L;

	 private int num;
	
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	 
}
