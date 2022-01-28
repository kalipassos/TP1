import java.util.Scanner;

public class Menu {
    public static int opcao() {
        System.out.println(
                "Bem-vindo ao jogo da forca! Selecione o que deseja fazer:\n 1. Gerenciar Temas\n 2. Gerenciar Palavras\n 3. Jogar\n 4. Sair");
        return new Scanner(System.in).nextInt();

    }

    public static void gerenciarTemas(String[][] temas) {
        int opcao;
        do {
            System.out.println(
                    "Gerenciamento de temas\n 1. Cadastrar \n 2. Buscar \n 3. Excluir\n 4. Voltar ao menu principal");
            opcao = new Scanner(System.in).nextInt();
            switch (opcao) {
                case 1:
                    Temas.cadastrar(temas);
                    break;

                case 2:
                    if (Quantidade.temas == 0) {
                        System.out.println("Nao ha temas cadastrados");
                    } else {
                        Temas.buscarT(temas);
                        System.out.println("\nRetornando ao menu:\n");
                    }
                    break;

                case 3:
                    Temas.deletarT(temas);
                    break;

                case 4:
                    Menu.opcao();
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente");
                    Menu.opcao();
                    break;
            }

        } while (opcao != 4);

    }

    public static void gerenciarPalavras(String[][] temas) {
        int opcao;
        System.out.println(
                "Gerenciamento de palavras\n 1. Cadastrar \n 2. Buscar \n 3. Excluir\n 4. Listar\n 5. Voltar");
        opcao = new Scanner(System.in).nextInt();
        switch (opcao) {
            case 1:
                Palavras.cadastrar(temas);
                break;

            case 2:
                Palavras.buscarP(temas);
                break;

            case 3:
                Palavras.deletarP(temas);
                break;

            case 4:
                Palavras.listarP(temas);
                break;

            default:
                System.out.println("Opcao invalida. Tente novamente");
                Menu.opcao();
                break;

        }
        while (opcao != 4)
            ;
    }

    public static void sair(String string) {
        System.exit(0);
    }
}