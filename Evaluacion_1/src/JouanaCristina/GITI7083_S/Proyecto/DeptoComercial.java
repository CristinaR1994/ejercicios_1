/**
 * 
 */
package JouanaCristina.GITI7083_S.Proyecto;

import java.util.List;

/**
 *@author Juana Cristina Rodriguez Vazquez
 *
 */
public class DeptoComercial {
	/**
	 * atributo propio de la clase
	 */
	private String responsable;
	
	/**
	 * Se hace la relación con la clase Comercial
	 */
	private Comercial pertenece;
	
	/**
	 * Se hace la relación con la clase Presupuestos
	 */
	private Presupuestos presupuestos;
	
	/**
	 * Comportaminetos de la clase
	 */
	
	public static void asignarViaje(){
		
	}
	public static void asignarLimite(){
		
	}
	public static void validarPresupuesto(){
		
	}
	/**
	 * @return responsable
	 */
	public String getResponsable() {
		return responsable;
	}
	/**
	 * @param responsable the responsable to set
	 */
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	/**
	 * Constructor de la clase
	 */
	public DeptoComercial(Comercial comercials, Presupuestos presupuestos) {

		// TODO Auto-generated constructor stub
	}

}
