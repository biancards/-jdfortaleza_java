import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		System.out.println("Bom Dia!Preciso que informe dois números.");
		
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		double n1,n2,soma;
		
		System.out.println("Informe o primeiro número:");
		
		n1= leitor.nextDouble();
		
		System.out.println("Informe o segundo número:");
		
		n2= leitor.nextDouble();
		
		soma=n1+n2;
		
		System.out.println("A soma dos dois número foi:"+soma);
		
		
		
		
	}

}
