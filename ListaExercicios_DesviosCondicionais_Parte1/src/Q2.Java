/*Q2
Ler um valor numérico inteiro positivo ou negativo e apresentar o valor lido como sendo um valor
positivo, ou seja, se o valor lido for menor ou igual a zero, ele deve ser multiplicado por -1.*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    
	    //declaração do scanner
	    Scanner scanner = new Scanner(System.in);
	    
	    //variáveis
	    int number1,number_positive = 0;
	    
	    //entradas
	    number1 = scanner.nextInt();
	    
	    //condição
	    if (number1 <= 0) {
	        number_positive = (number1 * (-1));
	    } else {
	        number_positive = number1;
	    }
	    
	    //saída
	    System.out.print("O número digitado foi: " + number_positive);
	    
	    //fechando o scanner
	    scanner.close();
	}
}