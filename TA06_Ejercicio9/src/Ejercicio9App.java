import javax.swing.JOptionPane;


public class Ejercicio9App {

	public static void main(String[] args) {
		
		mostrarNumeros();
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
	
	public static void mostrarNumeros(){ 
	// metodo para mostrar la posicion del arreglo y el numero guardado en esa posicion
		
		double listar [] = generarNumeros();
		double suma = 0;		
		for(int i=0; i < listar.length ; i++){
			
			JOptionPane.showMessageDialog(null, "Los numeros son:"+i+listar[i]);
		    suma += listar[i];
		}
		JOptionPane.showMessageDialog(null, "La suma de los  numeros es:"+suma);
    }
}

