import javax.swing.JOptionPane;


public class Ejercicio10App {

	public static void main(String[] args) {
			
		JOptionPane.showMessageDialog(null, "El mayor numero primo es:"+mayorNumeroPrimo());
	}
	    
		public static double[] generarNumeros(){ 
		// metodo para llenar arreglo de numeros
			String tamano = JOptionPane.showInputDialog("Introduce el tamaño del array");
			int tamanoInt = Integer.parseInt(tamano);
			
			double crear [] = new double [tamanoInt];
			for(int i=0; i < tamanoInt ; i++){
		    	String inicio = JOptionPane.showInputDialog("Introduce un numero");
				double inicioConvert = Double.parseDouble(inicio);
				crear [i] = inicioConvert;
			}
				return crear;	
	    }
		
		public static boolean primo (int numeroPrimo){
		//metodo para determinar si un numero es primo	
			boolean primo = false;
			if(numeroPrimo % numeroPrimo ==0 && numeroPrimo % 1 ==0 && numeroPrimo % 2 !=0 ){
				primo = true;
			}
				return primo;
		}
		
		public static double[] recorrerNumeros(){ 
		// metodo para mostrar los numeros ingresados, los que sean primos guardarlos en un Array. 
			double listar [] = generarNumeros();
			double[] numerosPrimos = new double[listar.length];
			
			for(int i=0; i < listar.length ; i++){
				if(  primo((int) listar[i])){
					numerosPrimos[i] = listar[i];
				}
			}
				return numerosPrimos;
	    }
		
		public static int mayorNumeroPrimo(){ 
			// metodo para recorrer el arreglo de Primos y determinar el mayor. 
				double primos [] = recorrerNumeros();
				int mayor = 3;
				for(int i=0; i < primos.length ; i++){
					if(  mayor < primos[i]){
						mayor = (int) primos[i];
					}
				}
					return mayor;
	    }

		
		
 }


