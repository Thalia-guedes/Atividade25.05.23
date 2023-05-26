import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fabrica fabrica = new Fabrica();
        System.out.println(" Qual tipo de conta deseja contruir");
        String tipo = scanner.next();
        Lampada lampada = Fabrica.contruirLampada(tipo);
        lampada.ligar();
        lampada.desligar();



    }


}