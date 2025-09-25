//Leia dois valores numéricos inteiros e apresente o resultado da diferença do maior valor pelo menor valor.

public class Main {

	public static void main(String[] args) {
	
    	//variáveis
    	int number1, number2, maior_numero = 0;
    	
    	//entradas
    	number1 = 4;
    	number2 = 9;
    	
    	//processamento
    	if (number1 > number2) {
    		maior_numero = (number1 - number2);
    	} else {
    		maior_numero = (number2 - number1);
    	}
    	System.out.print("A diferça do maior número pelo menor, é: " + maior_numero);
    }
}