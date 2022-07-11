
import javax.swing.JOptionPane;

public class Ejercicio1App {

	public static void main(String[] args) {
		
		String figura ="circulo"; 
		figura = JOptionPane.showInputDialog("Introduce figura: circulo, cuadrado o triangulo");
		
		switch(figura)
		{
			case "circulo":
				String ra = JOptionPane.showInputDialog("Introduce el radio del circulo");
				double raConvert = Double.parseDouble(ra);
				JOptionPane.showMessageDialog(null, "El Area del Circulo es de " +areaCirculo(raConvert));
				break;
			case "cuadrado":
				String lado = JOptionPane.showInputDialog("Introduce el lado del cuadrado");
				double ladoConvert = Double.parseDouble(lado);
				JOptionPane.showMessageDialog(null, "El Area del Cuadrado es de " +areaCuadrado(ladoConvert));
				break;
			case "triangulo":
				String b = JOptionPane.showInputDialog("Introduce la base del triangulo");
				double bConvert = Double.parseDouble(b);
				String a = JOptionPane.showInputDialog("Introduce la altura del triangulo");
				double aConvert = Double.parseDouble(a);
				JOptionPane.showMessageDialog(null, "El Area del Triangulo es de " +areaTriangulo(bConvert,aConvert));				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Introduce bien el nombre de la figura");	
		}

	}
	

    
	public static double areaCirculo (double radio ){
		return Math.pow(radio, 2)* Math.PI;
	}
	public static double areaTriangulo (double base, double altura ){
		return (base * altura)/2;
	}
	public static double areaCuadrado (double lado){
		return (lado * lado);
	}
}
