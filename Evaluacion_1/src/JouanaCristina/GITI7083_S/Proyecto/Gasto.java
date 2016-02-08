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
public class Gasto {
	/**
	 * Atributos de la clase Gasto
	 */
	private String lugar;
	private Date fecha;
	private String lnt;
	private String tipo;
	private String justificante;
	private Double precio;
	
	/**
	 * Se hace la relación con la clase Viaje
	 */
	private List<Viaje> pertenece;

	/**
	 * constructor de la clase
	 */
	public Gasto(Viaje viaje) {
		// TODO Auto-generated constructor stub
	}

}
