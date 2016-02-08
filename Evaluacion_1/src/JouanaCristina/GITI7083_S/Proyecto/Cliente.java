/**
 * 
 */
package JouanaCristina.GITI7083_S.Proyecto;

import java.util.List;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Cliente {
	/**
	 * Atributos de la clase
	 */
	private String rfc;
	private String nombre;
	private String domicilio;
	private String telefono;
	private String email;
	
	/**
	 * Se hace la relación con proyecto
	 */
	private Proyecto proyecto;
	
	/**
	 * Se hace la relación con presupuestos
	 */
	private List<Presupuestos> solicita;

	/**
	 * Constructor de la clase
	 */
	public Cliente(Presupuestos presupuestos) {
		// TODO Auto-generated constructor stub
	}

}
