import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Olá!Informe suas notas para que seja feita a média.");
		
		Scanner leitor = new Scanner(System.in);
		
		double n1,n2,n3,n4,soma,media;
		
		System.out.println("Digite sua primeira nota:");
		
		n1= leitor.nextDouble();
		
		System.out.println("Digite sua segunda nota:");
		
		n2= leitor.nextDouble();
		
		System.out.println("Digite sua terceira nota:");
		
		n3= leitor.nextDouble();
		
		System.out.println("Digite sua quarta nota:");
		
		n4= leitor.nextDouble();
		
		soma=n1+n2+n3+n4;
		
		media=soma/4;
		
		System.out.println("Sua média final foi:"+media);
		
		

	}

}
