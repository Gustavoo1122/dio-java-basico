import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int nrConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite o seu nome: ");
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o número da Agência: ");
		agencia = sc.nextLine();
		
		System.out.println("Por favor, digite o número da Conta: ");
		nrConta = sc.nextInt();
		
		
		System.out.println("Por favor, digite o seu saldo: ");
		saldo = sc.nextDouble();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+nrConta+" e seu saldo "+saldo+" já está disponível para saque");
		
		sc.close();
	}
}