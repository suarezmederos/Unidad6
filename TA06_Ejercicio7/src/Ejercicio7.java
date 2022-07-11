import javax.swing.JOptionPane;


public class Ejercicio7 {

	public static void main(String[] args) {
		
		String moneda = JOptionPane.showInputDialog("Introduce una moneda: dolar,yen o libra");
		
		switch(moneda)
		{
			case "dolar":
				JOptionPane.showMessageDialog(null, "La cantidad de euros es"+(calcularCambioMoneda(moneda)) + "en dolares");
				break;
			case "yen":
				JOptionPane.showMessageDialog(null, "La cantidad de euros es"+(calcularCambioMoneda(moneda)) + "en yen");
				break;
			case "libra":
				JOptionPane.showMessageDialog(null, "La cantidad de euros es"+(calcularCambioMoneda(moneda)) + "en libras");				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Introduzca bien el Nombre Moneda");				
				break;
			 
		}

	}
	

    
	public static double calcularCambioMoneda( String monedaCambio ){
		
		String[] monedas = new String[] {"dolar","yen","libra"};
		double calcular= 0;
		String cantidadEuros = JOptionPane.showInputDialog("Introduce una cantidad de Euros a convertir");
		double cantidadEuro = Double.parseDouble(cantidadEuros);
		
		if(monedaCambio.equals(monedas[0])){
			 calcular = cantidadEuro * 0.86;
		}else if(monedaCambio.equals(monedas[1])){
			 calcular = cantidadEuro * 129.852;
		}
		else{
			calcular = cantidadEuro * 1.28611;
		}
			return calcular;
	}
	

}


