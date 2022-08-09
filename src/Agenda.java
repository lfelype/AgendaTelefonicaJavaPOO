import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Contato> list = new ArrayList<>();
        char controle = 's';
        while (controle == 's' || controle == 'S') {

            System.out.println();
            System.out.println("Digite o nome para adicionar:");
            String nome = sc.nextLine();
            System.out.println("Digite o número para adicionar: ");
            String numero = sc.nextLine();
            System.out.println("Deseja cadastrar mais algum contato? S ou N");
            controle = sc.nextLine().charAt(0);
            Contato cont = new Contato(nome, numero);
            list.add(cont);
        }

        for (Contato i: list) {
            System.out.println("");
            System.out.println(i);
        }
    }
}
