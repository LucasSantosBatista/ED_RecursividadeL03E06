
package view;

import javax.swing.JOptionPane;

import controller.SomaFatController;

/**
 * @author Lucas Batista
 * 3 de mar. de 2024
 */
public class Main {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para fatorial na somatória: "));

		SomaFatController sfCont = new SomaFatController();
		double resultado = sfCont.calculaSomatoria(n);  
		System.out.println("Resultado: " + resultado);
	}

}
