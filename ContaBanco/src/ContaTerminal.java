import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Informe o número da Agência: ");
        conta.setAgencia(sc.nextLine());

        System.out.println("Informe o número da Conta: ");
        conta.setConta(sc.nextInt());

        sc.nextLine();

        System.out.println("Digite seu Nome: ");
        conta.setCliente(sc.nextLine());

        System.out.println("Digite o Saldo da conta: ");
        conta.setSaldo(sc.nextDouble());
    
        sc.nextLine();
        sc.close();

        System.out.println(conta.toString());
    }
}
