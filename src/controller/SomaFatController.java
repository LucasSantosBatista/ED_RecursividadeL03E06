package controller;

/**
 * @author Lucas Batista
 * 3 de mar. de 2024
 */
public class SomaFatController {

	public SomaFatController() {
		super();
	}

	public double calculaSomatoria(int n) {
		//Condição de parada: contagem é 1. 
				if (n == 1) {
					//Último termo retorna 1, somando ao calculo
		            return 1.0;
		        } else {
		        	
		        	//Recursiva chamando o calculo, a cada termo calcula 1/N! na contagem atual,  
		        	//chamando outra função recursiva para calcular fatorial
		            return calculaSomatoria(n - 1) + 1.0 / calculaFat(n);
		        }

	}
	//Calcula fatorial
	public double calculaFat(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calculaFat(n - 1);
		}
	}

}
