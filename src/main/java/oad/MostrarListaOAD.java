package oad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ot.PersonaOT;



public class MostrarListaOAD {

	
	
	public MostrarListaOAD() {}

	private static MostrarListaOAD instance;
	
	public static MostrarListaOAD getInstance() {
		   if (instance == null)
	            instance = new MostrarListaOAD();
	        return instance;
	}
	
	
	
	   public ArrayList<PersonaOT> obtenerListaPersonas() throws SQLException {
//	        Connection con = null;
//	        PreparedStatement pstmt = null;
//	        ResultSet rs = null;
		   
	        ArrayList<PersonaOT> listaPersonaOT = new ArrayList();
	        try {
//	            String query = ConstructorConsultas.obtenerListaPersonas();
	        	 String query = "SELECT p.nombre, p.apellido1, p.apellido2 FROM personas p WHERE p.nombre like ?";


	            //Obtener conexión:
                    //Connection con = JCYLGestionTransacciones.getConnection();
	            
                    // preparamos los datos
//	            con = super.getConnexion();
//	            pstmt = con.prepareStatement(query);

//	            int i = 0;
//	            pstmt.setString(++i, nombre);

//	            rs = pstmt.executeQuery();

//	            PersonaOT personaOT = null;
//	            while (rs.next()) {
//	            	personaOT = new PersonaOT();
//	            	personaOT.setNombre(rs.getString("nombre"));
//	            	personaOT.setApellido1(rs.getString("apellido1"));
//	            	personaOT.setApellido2(rs.getString("apellido2"));
//	                lista.add(personaOT);
//	            }
	            
	        	 
	        	 
	        	 
	        	 listaPersonaOT.add(new PersonaOT("MARIANO","TORREJON","MOLANO"));
	        	 listaPersonaOT.add(new PersonaOT("FRANCISCO ","CLEMENTE ","ANTONIO"));
	        	 listaPersonaOT.add(new PersonaOT("JULIA ","VICENS ","ALLENDE"));
	        	 listaPersonaOT.add(new PersonaOT("ESPERANZA ","JULIAN ","SANABRIA"));
	        	 listaPersonaOT.add(new PersonaOT("FERNANDO ","ZAMORA ","CAÑADAS"));
	        	 listaPersonaOT.add(new PersonaOT("JOSEFA ","SEPULVEDA ","ANDRES"));
	        	 listaPersonaOT.add(new PersonaOT("RAUL ","FRANCISCO ","LOPEZ"));
	            
	        } finally {
                    // Cerrar conexión:
                    //JCYLGestionTransacciones.close(con.getAutoCommit());

//	            super.cerrarResultSet(rs);
//	            super.cerrarPreparedStatement(pstmt);
//	            super.cerrarConnection(con);
	        }
	        return listaPersonaOT;
	    }
	
	
	
	
	
	
}
