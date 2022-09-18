import java.util.Scanner;

public class Ola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Boa Noite!");
        
        Scanner leitor = new Scanner(System.in);
        
        String variavel;
        
        System.out.println("Por favor, informe seu nome:");
        
        variavel=leitor.nextLine();
        
        int idade;
        
        System.out.println("Informe sua idade:");
        
        idade=leitor.nextInt();
        
	 System.out.println("Olá," + variavel+" sua idade é:"+idade);
	 
	 System.out.println(idade+55);
	 
	 System.out.println(idade/10);
	 System.out.println(idade*10);
	 
	 
	}}


