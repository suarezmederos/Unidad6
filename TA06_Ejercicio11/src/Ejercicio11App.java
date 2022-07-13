import javax.swing.JOptionPane;


public class Ejercicio11App {

	public static void main(String[] args) {
		
		String tam = JOptionPane.showInputDialog("Introduce el tamaño del arreglo");
		int tamConvert = Integer.parseInt(tam);
		
		int arreglo1[] = generarArray(tamConvert);
		int arreglo2[] = arreglo1.clone();
		int resultado[] = multiplicarArray(arreglo1,arreglo2);
		
		JOptionPane.showMessageDialog(null, "El primer arreglo es:");
		mostrarArreglo(arreglo1);
		
		JOptionPane.showMessageDialog(null, "El segundo arreglo es:");
		mostrarArreglo(arreglo2);
		
		JOptionPane.showMessageDialog(null, "El arreglo producto de la multiplicacion de los 2 anteriores es:");
		mostrarArreglo(resultado);

	}
	
	public static int[] generarArray( int valor){ 
		// metodo para crear array y rellenarlo con numeros introducidos;
			int array1 [] = new int [valor];
			for(int i=0; i < array1.length ; i++){
				String inicio = JOptionPane.showInputDialog("Introduce un numero");
				int inicioConvert = Integer.parseInt(inicio);
				array1 [i] = inicioConvert;
			}
				return array1;
    }
	
	public static int[] multiplicarArray(int array1[], int array2[]){
		int[] arrayResultado = new int [array1.length];
		for(int i=0; i < array1.length; i++){
			for(int j=0; j < array2.length; j++){
				arrayResultado[i] = array1[i] * array2[j];
			}
		}
			return arrayResultado;
	}
	
	public static void mostrarArreglo(int[] array){
		for(int i =0; i < array.length; i++){
			JOptionPane.showMessageDialog(null, "El arreglo en"+i+ "es:"+array[i]);
		}
	}

}
