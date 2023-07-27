import entities.ContaTerminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int number = sc.nextInt();
        System.out.println("Por favor, digite o número da agencia: ");
        sc.nextLine();
        String agency = sc.nextLine();
        System.out.println("Por favor, digite o nome do titular da conta: ");
        String holder = sc.nextLine();
        System.out.println("Por favor, digite o valor do depósito inicial: ");
        double initialDeposit = sc.nextDouble();

        ContaTerminal account = new ContaTerminal(number, agency, holder, initialDeposit);

        System.out.println(account);
        sc.close();
    }
}