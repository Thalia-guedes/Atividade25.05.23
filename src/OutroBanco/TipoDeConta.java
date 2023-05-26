package OutroBanco;

import java.util.Scanner;

public class TipoDeConta implements Banco {

    public TipoDeConta(String ContaPoupanca, String ContaCorrente , String SeguroDeVida) {

        this.ContaPoupanca();
        this.ContaCorrente();
        this.SeguroDeVida();
    }

    @Override
    public void ContaPoupanca() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja Criar uma conta ?");
        scanner.next();
        System.out.println("Conta Poupanca criada e isenta de tributos");
        System.out.println("--------------------------");
    }
    @Override
    public void ContaCorrente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Deseja Criar uma conta Corrente?");
        scanner.next();

        System.out.println("Conta Criada, informamos que no ato da aquisicao da conta corrente, é cobrado " +
                "1% sobre o valor do seu saldo");

        System.out.println("--------------------------");

    }
    @Override
    public void SeguroDeVida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja adicionar o plano seguro de vida ?");
        scanner.next();
        System.out.println("Confirmada a aquisicao do Plano de vida no valor de R$42,00");

    }

}


