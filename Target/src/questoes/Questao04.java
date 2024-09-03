package questoes;

public class Questao04 {

	public int questaoA() {
		int[] sequencia = { 1, 3, 5, 7 };

		return sequencia[sequencia.length - 1] + 2;
	}

	public int questaoB() {
		int[] sequencia = { 2, 4, 8, 16, 32, 64 };

		// Cada número é o dobro do anterior
		return sequencia[sequencia.length - 1] * 2;

	}

	public int questaoC() {
		int[] sequencia = { 0, 1, 4, 9, 16, 25, 36 };

		int n = (int) Math.sqrt(sequencia[sequencia.length - 1]) + 1;
		// int nextElement = n * n;
		return n * n;
	}

	public int questaoD() {
		int[] sequencia = { 4, 16, 36, 64 };

		int n = (int) Math.sqrt(sequencia[sequencia.length - 1]) + 2;
		return n * n;
	}

	public int questaoE() {
		int[] sequencia = { 1, 1, 2, 3, 5, 8 };

		return sequencia[sequencia.length - 1] + sequencia[sequencia.length - 2];

	}

	public int questaoF() {
		int[] sequencia = { 2, 10, 12, 16, 17, 18, 19 };

		return sequencia[sequencia.length - 1] + 1;
	}
}