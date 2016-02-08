/**
 * 
 */
package JuanaCristina.GITI7083_S.InterfaceFigura;

import java.util.Scanner;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Testinterface implements Figura {

	/**
	 * Atributos de la clase
	 */
	Cuadrado cuadrado;
	Circulo circulo;
	Triangulo triangulo;
	
	public Testinterface() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public void test(){
		cuadrado= new Cuadrado();
		triangulo= new Triangulo();
		circulo= new Circulo();
		Figura figura;
		Scanner scaner = new Scanner(System.in);
		System.out.println("TEscriba la figura que decea ");
		int seleccion =scaner.nextInt();
		
		switch (seleccion) {
		case 1:
			figura= new Cuadrado();
						break;
						
		case 2:
			figura= new Circulo();
						break;

		case 3:
			figura= new Triangulo();
						break;
		default:
			break;
		}
	}
	
	
	public static void main(String[] args) {
		 new Testinterface().test();
		 
	}
}
