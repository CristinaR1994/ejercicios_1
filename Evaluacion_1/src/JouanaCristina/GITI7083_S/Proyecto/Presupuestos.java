/**
 * 
 */
package JouanaCristina.GITI7083_S.Proyecto;

import java.util.Date;
import java.util.List;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Presupuestos {
	/**
	 * Se hace la relaci�n con la clase DeptoComercial
	 */

	private List<DeptoComercial> valida;
	/**
	 * Se hace la relaci�n con la clase Cliente
	 */
	private Cliente cliente;
	
	/**
	 * atributos propios de la clase
	 */
	private Date fecha;
	private String descipcion;
	private Double importe;
	private String estado;
	
	/**
	 * Se hace la relaci�n con la clase Comercial
	 */
	private Comercial calcula;
	/**
	 * Se hace la relaci�n con la clase Viaje
	 */
	private List<Viaje> tiene;
	
	/**
	 * Se hace la relaci�n con la clase Proyecto
	 */
	private List<Proyecto> proyectos;

	/**
	 * Constructor de la clase
	 */
	public Presupuestos(IConsutarEstado consutarEstado, Cliente cliente,
			Viaje viaje, Proyecto proyecto) {
		// TODO Auto-generated constructor stub
	}

}
