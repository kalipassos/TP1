import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        int opcao;
        String[][] temas = new String[50][51];
        Temas.existentes(temas);

        do {
            opcao = Menu.opcao();
            switch (opcao) {
                case 1:
                    Menu.gerenciarTemas(temas);
                    break;

                case 2:
                    Menu.gerenciarPalavras(temas);
                    break;
                case 3:
                    Forca.jogo(args, temas);

                    break;
                case 4:
                    Menu.sair("Sair");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente");
                    Menu.opcao();
                    break;
            }

        } while (opcao != 4);

    }

}
