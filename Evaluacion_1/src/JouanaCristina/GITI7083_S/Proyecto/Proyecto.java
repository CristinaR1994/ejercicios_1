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
public class Proyecto {
	Maquina maquina;
	public Proyecto() {
		System.out.println("Nuevo proyecto");
		maquina= new Maquina();
	}
	/**
	 * Atributos propios de la clase
	 */
	private String nombre;
	private String planificacion;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private String estado;
	
	/**
	 * Se hace la relación con otras clases
	 */
	private List<Presupuestos> presupuestos;
	
	private Maquina maquinas;

	/**
	 * Constructor del la clase
	 */
	public Proyecto(Presupuestos presupuestos,Maquina maquina) {
		// TODO Auto-generated constructor stub
	}

}
