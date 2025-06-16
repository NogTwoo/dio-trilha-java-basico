import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
       System.out.println("Por favor, digite o número da conta: \n");
       var number = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência: \n");
       var agency = scanner.next();
       System.out.println("Por favor, informe o seu nome: \n");
       var clientName = scanner.next();
       System.out.println("Por favor, digite o saldo disponível: \n");
       var balance = scanner.nextFloat();
      System.out.println("\n Olá " + clientName + ", obrigado por criar uma conta, sua agência é " + agency + ", conta " + number + " e seu saldo R$" + balance + " já está disponível para saque");
    }
}
