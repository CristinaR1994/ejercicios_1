/**
 * 
 */
package JuanaCristina.GITI7083_S.Canino;

/**
 * @author Juana Cristina Rodriguez Vazquez
 * 
 *Esta clase hereda de Canino
 *
 */
public class Perro extends Canino{
	
	
	public Perro() {
		System.out.println("Hola soy un perro ");
	}
		
	/**
	 * comportamientos que hereda
	 */
		@Override
		public Package comer() {
			// TODO Auto-generated method stub
			return super.comer();
		}
		
		@Override
		public Package hacerRuido() {
		// TODO Auto-generated method stub
		return super.hacerRuido();
		}
		
		/**
		 * comportamientos propios de esta clase
		 */
		public void sacarPaseo(){
			
		}
		
		public void vacunar(){
			System.out.println("y estoy vacunado");
		}

}
