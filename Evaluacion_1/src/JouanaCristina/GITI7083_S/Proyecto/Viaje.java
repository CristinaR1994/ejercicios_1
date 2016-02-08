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
public class Viaje {
	/**
	 * Atributos propios de la clase
	 */
	private int limite;
	private boolean transporte;
	private String motivo;
	private Date fechaIda;
	private Date fechaVuelta;
	private String Estado;
	
	/**
	 * Se hace la relación con otras clases
	 */
	private List<Comercial>realiza;
	
	private Presupuestos se_realiza_en;
	
	private Gasto gasto;
	
	/**
	 * Constructor de la clase
	 */
	public Viaje(Comercial comercial, Presupuestos presupuestos, Gasto gasto) {
		// TODO Auto-generated constructor stub
	}

}
