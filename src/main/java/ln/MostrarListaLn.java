package ln;

import java.sql.SQLException;
import java.util.ArrayList;

import oad.MostrarListaOAD;
import ot.PersonaOT;

public class MostrarListaLn {

	
	public MostrarListaLn() {}
	
	
	public ArrayList<PersonaOT> obtenerListaPersonas() {
		
                // Si necesito transacción:
                //JCYLGestionTransacciones.open(false);
                
		  ArrayList<PersonaOT> listaPersonaOT = new ArrayList();
			try {
		MostrarListaOAD mostrarListaOAD = MostrarListaOAD.getInstance();
		listaPersonaOT = mostrarListaOAD.obtenerListaPersonas();
                // Si tengo transacción:
                //JCYLGestionTransacciones.commit();
		} catch (SQLException e) {
                        // Si tengo transacción:
                         //JCYLGestionTransacciones.rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
                    // Si tengo transacción:
                    //JCYLGestionTransacciones.close(true);
                }
		
		
		return listaPersonaOT;
	}
	
	
}
