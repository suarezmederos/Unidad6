import javax.swing.JOptionPane;


public class Ejercicio6App {

	public static void main(String[] args) {
		
		String nu = JOptionPane.showInputDialog("Introduce un numero");
		int numConvert = Integer.parseInt(nu);
        
		JOptionPane.showMessageDialog(null, "La cantidad de cifras del numero es:"+cantCifras(numConvert));
	}
	
public static int cantCifras (int numero){
		
	String n = Integer.toString(numero);
		
		return +n.length();
    }

}
