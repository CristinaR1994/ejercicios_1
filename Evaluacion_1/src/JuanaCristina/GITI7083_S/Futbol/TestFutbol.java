/**
 * 
 */
package JuanaCristina.GITI7083_S.Futbol;

import java.util.Scanner;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class TestFutbol {

	public void test(){
		IntegranteSeleccionFutbol integranteSeleccionFutbol;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Integrantes de la seleccion de futbol: ");
		integranteSeleccionFutbol= new Entrenador();
		integranteSeleccionFutbol= new Masajista();
		integranteSeleccionFutbol= new futbolista();
	}
	
	
	public static void main(String[] args) {
		new TestFutbol().test();
	}
}
