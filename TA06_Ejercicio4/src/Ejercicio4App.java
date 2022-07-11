import javax.swing.JOptionPane;


public class Ejercicio4App {

	public static void main(String[] args) {
		
		String nu = JOptionPane.showInputDialog("Introduce un numero");
		int numConvert = Integer.parseInt(nu);
		JOptionPane.showMessageDialog(null, "El factorial es"+calculoFactorial(numConvert));
	}
	
	public static int calculoFactorial(int numero){
		int factorial = 1;
		for(int i=numero; i > 0 ; i--){
			factorial = factorial * i;
		}
			return factorial;
	}

}
