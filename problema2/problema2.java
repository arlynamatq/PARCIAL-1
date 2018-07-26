package problema2;

import javax.swing.JOptionPane;


public class problema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double IVA=0.21;
		 
        String texto=JOptionPane.showInputDialog("Introduce el precio de un producto");
        
        double precio=Double.parseDouble(texto);
 
        
        double precioFinal=precio+(precio*IVA);
 
        System.out.println("Precio final: " + precioFinal);

	}

}
