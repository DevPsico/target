package questoes;

public class Questao03 {
	
	 private static final int INDICE = 12;

	public int calcular() {
		int soma = 0;
		int k = 1;

		// Enquanto K for menor que INDICE, execute o loop
		while (k < INDICE) {
			k = k + 1;
			soma = soma + k;
		}

		return soma;
	}
}