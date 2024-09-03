package questoes;

public class Questao02 {

	public int contarLetra(String input) {
		int count = 0;

		for (char c : input.toCharArray()) {
			if (c == 'a' || c == 'A') {
				count++;
			}
		}

		return count;
	}
}