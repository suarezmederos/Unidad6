
import javax.swing.JOptionPane;


public class Ejercicio8App {

	public static void main(String[] args) {
		
		generarNumeros();
		mostrarNumeros();
	}
    
	public static double[] generarNumeros(){ 
	// metodo para llenar arreglo de numeros
		
		int tamano = 10;
		double crear [] = new double [tamano];
	
		for(int i=0; i < tamano ; i++){
	    	String inicio = JOptionPane.showInputDialog("Introduce un numero");
			double inicioConvert = Double.parseDouble(inicio);
			crear [i] = inicioConvert;
		}
			return crear;	
    }
	
	public static void mostrarNumeros(){ 
	// metodo para mostrar la posicion del arreglo y el numero guardado en esa posicion
		
		double listar [] = generarNumeros();
				
		for(int i=0; i < listar.length ; i++){
			
			JOptionPane.showMessageDialog(null, "Los numeros son:"+i+listar[i]);
		}	
    }
}
