import javax.swing.JOptionPane;


public class Ejercicio3App {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Introduce un numero");
		int numConvert = Integer.parseInt(num);
        if (primo(numConvert)){
        	JOptionPane.showMessageDialog(null, "El numero es primo");
        }else{
        	JOptionPane.showMessageDialog(null, "El numero no es primo");
        }
	}
	
	
	public static boolean primo(int primo){
		boolean numeroPrimo = false;
		if ( primo % primo ==0 && primo % 1 ==0 && primo % 2 !=0 ){
			numeroPrimo = true;
		}
    		return numeroPrimo;
    }
}
