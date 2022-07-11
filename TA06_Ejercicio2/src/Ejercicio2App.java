import javax.swing.JOptionPane;


public class Ejercicio2App {

	public static void main(String[] args) {
		
		generarNumeros();
	}
    
	public static void generarNumeros(){
		//A partir de un intervalo de numeros, se crea un arreglo, y muestra todos los numeros en ese intervalo
		String inicio = JOptionPane.showInputDialog("Introduce a partir de que numero se empiece a generar");
		int inicioConvert = Integer.parseInt(inicio);
		String fin = JOptionPane.showInputDialog("Introduce hasta que numero se genere");
		int finConvert = Integer.parseInt(fin);
		
		int tamano = finConvert--;
		
		int crear [] = new int [tamano];
		for(int i=0; i < tamano ; i++){
			crear [i] = inicioConvert;
			inicioConvert++;
			JOptionPane.showMessageDialog(null, "El primer numero es" +crear[i]);
		}
			
    }
}
