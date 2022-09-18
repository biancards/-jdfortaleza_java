import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bom Dia!");
		
		Scanner leitor = new Scanner(System.in);
		
		double salario,horas,valor;
		
		System.out.println("Qual o seu valor de horas trabalhada?");
		
		valor=leitor.nextDouble();
		
		System.out.println("Quantas horas você trabalha?");
		
		horas=leitor.nextDouble();	
		
		salario=valor*horas;
		
		
		System.out.println("Seu salário é:"+salario);	

	}

}
