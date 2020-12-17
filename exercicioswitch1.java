
import java.util.Scanner;

public class exercicioswitch1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("======MENU======");
        System.out.println("1 - Hamburguer - R$10");
        System.out.println("2 - Cachorro-Quente - R$7");
        System.out.println("3 - Batata frita - Cortesia");
        System.out.println("4 - Queijo quente - Cortesia");
        System.out.println("5 - Cup Noodles - Cortesia");
        System.out.println("Digite a opcao desejada: ");

        double totalGasto = 0;

        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("O seu hamburguer está sendo preparado.");
                totalGasto = 10;
                break;
            case 2:
                System.out.println("O seu cachorro quente está sendo preparado.");
                totalGasto = 7;
                break;
            case 3:
                System.out.println("Sua batata frita esta sendo preparada.");
                break;
            case 4:
                System.out.println("Seu queijo quente esta sendo preparado.");
                break;
            case 5:
                System.out.println("Seu Cup Noodes saira em 3 minutos!");
            default:
                System.out.println("Voce nao escolheu nada.");

        }

        System.out.println("Total gasto: " + totalGasto);
        System.out.println("Tchau!");

    }

}
