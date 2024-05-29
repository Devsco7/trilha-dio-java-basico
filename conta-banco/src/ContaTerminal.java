import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
		int numero = 0723;
		String agenciaConta = "143-2";
		String nomeCliente = "PEDRO HENRIQUE";
		double saldo = 235.47;

		System.out.println("---------------CONTA BANCÁRIA---------------");
		System.out.println();
		System.out.println("Por favor, digite o número da Conta: ");
		numero = scn.nextInt();

		System.out.println("Agora digite o número da Agência: ");
		agenciaConta = scn.next();

		System.out.println("Me informe seu nome: ");
		nomeCliente = scn.next();
		scn.nextLine();

		System.out.println("Agora me informe seu saldo atual: ");
		saldo = scn.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agenciaConta, numero, saldo);

		scn.close();
	}

    
    
    
    
    
    
    
    
    
    
    
    //TODO: Conhecer e importar a classe scanner

    //Exibir as mensagens para nosso usuario

    //Obter pela classe scanner os valores digitados no terminal

    //Exibir a mensagem da conta criada
    }

