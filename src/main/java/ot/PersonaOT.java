package ot;

public class PersonaOT implements java.io.Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = 5066559019940719561L;

		protected String nombre;

	    protected String apellido1;

	    protected String apellido2;
	
		 public PersonaOT(String nombre, String apellido1, String apellido2) {
				super();
				this.nombre = nombre;
				this.apellido1 = apellido1;
				this.apellido2 = apellido2;
			}
		 
			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public String getApellido1() {
				return apellido1;
			}

			public void setApellido1(String apellido1) {
				this.apellido1 = apellido1;
			}

			public String getApellido2() {
				return apellido2;
			}

			public void setApellido2(String apellido2) {
				this.apellido2 = apellido2;
			}
}
