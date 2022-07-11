import javax.swing.JOptionPane;


public class Ejercicio5App {

	public static void main(String[] args) {
		
		String nu = JOptionPane.showInputDialog("Introduce un numero");
		int numConvert = Integer.parseInt(nu);
		JOptionPane.showMessageDialog(null, "El numero en binario es"+convertirBinario(numConvert));
		
		
	}
	
	public static String convertirBinario (int numero){
		
		String binario = Integer.toBinaryString(numero);
		
			return binario;
    }

}
