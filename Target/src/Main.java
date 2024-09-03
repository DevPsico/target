import java.util.Scanner;
import questoes.Questao01;
import questoes.Questao02;
import questoes.Questao03;
import questoes.Questao04;
import questoes.Questao05;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * QUESTÃO 01
		 */
		
		/*
		Questao01 q01 = new Questao01();

		System.out.print("Digite um número para verificar se ele está na sequência de Fibonacci: ");
		int num = scanner.nextInt();

		if (q01.eFibonacci(num)) {
			System.out.println(num + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println(num + " não pertence à sequência de Fibonacci.");
		}

		scanner.close();
		*/

		/*
		 * QUESTÃO 02
		 */

		/*
		Questao02 q02 = new Questao02();

		System.out.print("Digite uma palavra: ");
		String input = scanner.nextLine();

		int count = q02.contarLetra(input);

		if(count>0)
		{
			System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + count + " vez(es) na palavra.");
		}else
		{
			System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na palavra.");
		}

		scanner.close();
		*/
		
		/*
		*  QUESTAO 03	
		*/
		/*
		Questao03 q03 = new Questao03();
		 
		 int soma = q03.calcular();
		  
		 System.out.println("O valor da variável SOMA é: " + soma + ".");
		 */
		 
		/*
		 *  QUESTAO 04
		 */
		/*
		 Questao04 q04 = new Questao04();
		 System.out.println("a) 1, 3, 5, 7, ___");
		 System.out.println("O próximo valor é: " + q04.questaoA()+"\n");
		  
		 System.out.println("b) 2, 4, 8, 16, 32, 64, ____");
		 System.out.println("O próximo valor é: " + q04.questaoB()+"\n");
		  
		 System.out.println("c) 0, 1, 4, 9, 16, 25, 36, ____");
		 System.out.println("O próximo valor é: " + q04.questaoC()+"\n");
		  
		 System.out.println("d) 4, 16, 36, 64, ____");
		 System.out.println("O próximo valor é: " + q04.questaoD()+"\n");
		  
		 System.out.println("e) 1, 1, 2, 3, 5, 8, ____");
		 System.out.println("O próximo valor é: " + q04.questaoE()+"\n");
		  
		 System.out.println("f) 2,10, 12, 16, 17, 18, 19, ____");
		 System.out.println("O próximo valor é: " + q04.questaoF()+"\n");
		*/
		
		
		/*
		 *  QUESTAO 05
		 */
		
		Questao05 q05 = new Questao05();
		
		System.out.println(q05.resposta());
		
	}
}