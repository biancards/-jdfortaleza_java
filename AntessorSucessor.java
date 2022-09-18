import java.util.Scanner;

public class AntessorSucessor {
	
	public static void main(String[] args) {
	System.out.println("Bom Dia!");
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Por favor, digite um número:");
	
	double numero = leitor.nextDouble();
	
	System.out.println("O número informado foi:"+numero);
	
	System.out.println("O seu número antecessor é:"+(numero-1));
	
	System.out.println("O seu número sucessor é:"+(numero+1));

}}
