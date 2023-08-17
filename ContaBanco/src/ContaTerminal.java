import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia;
        agencia = ler.next();

        System.out.println("Por favor, digite o Número da Conta !");
        int numero;
        numero = ler.nextInt();
                
        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente;
        nomeCliente = ler.next();

        System.out.println("Por favor, digite o Saldo:");
        double saldo;
        saldo = ler.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
