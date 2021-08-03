package ln;

import java.sql.SQLException;
import java.util.ArrayList;

import oad.MostrarListaOAD;
import ot.PersonaOT;

public class MostrarListaLn {

	
	public MostrarListaLn() {}
	
	
	public ArrayList<PersonaOT> obtenerListaPersonas() {
		
		  ArrayList<PersonaOT> listaPersonaOT = new ArrayList();
			try {
		MostrarListaOAD mostrarListaOAD = MostrarListaOAD.getInstance();
		listaPersonaOT = mostrarListaOAD.obtenerListaPersonas();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listaPersonaOT;
	}
	
	
}
