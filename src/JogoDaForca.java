import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        int opcao;
        String[][] temas = new String[50][51];
        Integer[] qtdPalavrasTema = new Integer[51];
        Integer[] qtdTemas = new Integer[1];
        qtdTemas[0] = 0;

        do {
            opcao = Menu.opcao();
            switch (opcao) {
                case 1:
                    Menu.gerenciarTemas(qtdPalavrasTema, qtdTemas, temas);
                    break;

                case 2:
                    Menu.gerenciarPalavras(qtdPalavrasTema, qtdTemas, temas);
                    break;
                case 3:
                    Menu.jogarJogo("Jogar");
                    break;
                case 4:
                    Menu.sair("Sair");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente");
                    break;
            }

        } while (opcao != 4);

    }

}
