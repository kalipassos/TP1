import java.util.Scanner;

public class Menu {
    public static int opcao() {
        System.out.println(
                "Bem-vindo ao jogo da forca! Selecione o que deseja fazer:\n 1. Gerenciar Temas\n 2. Gerenciar Palavras\n 3. Jogar\n 4. Sair");
        return new Scanner(System.in).nextInt();

    }

    public static void gerenciarTemas(Integer[] qtdPalavrasTema, Integer[] qtdTemas, String[][] temas) {
        int opcao;
        do {
            System.out.println(
                    "Gerenciamento de temas\n 1. Cadastrar \n 2. Buscar \n 3. Excluir\n 4. Voltar ao menu principal");
            opcao = new Scanner(System.in).nextInt();
            switch (opcao) {
                case 1:
                    Temas.existentes(qtdPalavrasTema, qtdTemas, temas);
                    Temas.cadastrar(qtdPalavrasTema, qtdTemas, temas);
                    break;

                case 2:
                    Temas.existentes(qtdPalavrasTema, qtdTemas, temas);
                    if (qtdTemas[0] == 0) {
                        System.out.println("Nao ha temas cadastrados");
                    } else {
                        Temas.buscarT(qtdPalavrasTema, qtdTemas, temas);
                        System.out.println("\nRetornando ao menu:\n");
                    }
                    break;

                case 3:
                    Menu.jogarJogo("Jogar");
                    break;

                case 4:
                    Menu.opcao();
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente");
                    break;
            }

        } while (opcao != 4);

    }

    public static void gerenciarPalavras(Integer[] qtdPalavrasTema, Integer[] qtdTemas, String[][] temas) {
        int opcao;
        System.out.println(
                "Gerenciamento de palavras\n 1. Cadastrar \n 2. Buscar \n 3. Excluir\n 4. Listar\n 5. Voltar");
        opcao = new Scanner(System.in).nextInt();
        switch (opcao) {
            case 1:
                // Palavras.existentesP(qtdPalavrasTema, qtdTemas, temas);
                Palavras.cadastrar(qtdPalavrasTema, qtdTemas, temas);
                break;

            case 2:
                // Palavras.existentesP(qtdPalavrasTema, qtdTemas, temas);
                Palavras.buscarP(qtdPalavrasTema, qtdTemas, temas);
                if (qtdTemas[0] == 0) {
                    System.out.println("Nao ha palavras cadastradas");
                } else {
                    Temas.buscarT(qtdPalavrasTema, qtdTemas, temas);
                    System.out.println("\nRetornando ao menu:\n");
                }
                break;

            default:
                System.out.println("Opcao invalida. Tente novamente");
                break;

        }
        while (opcao != 4)
            ;

    }

    public static int jogarJogo(String string) {
        System.out.println(
                "Selecione o tema desejado:\n 1. Tema 1\n 2. Tema 2\n 3. Tema 3\n 4. Voltar");
        Scanner sc = new Scanner(System.in);
        return new Scanner(System.in).nextInt();

    }

    public static void sair(String string) {
        System.exit(0);
    }

}