/**
 * 
 */
package JouanaCristina.GITI7083_S.Proyecto;

import java.util.List;

/**
 *@author Juana Cristina Rodriguez Vazquez
 *
 */
public class Maquina {
	public Maquina() {
		System.out.println("M�quina empleado: xxxx");
	}
	/**
	 * atributos de la clase
	 */
	private String nombre;
	private Double importe;
	
	/**
	 * Se hace la relaci�n con la clase Proyecto
	 */
	private List<Proyecto> tieneAsignadas;

	/**
	 * Contructor de la clase
	 */
	public Maquina(Proyecto proyecto) {
		// TODO Auto-generated constructor stub
	}

}
