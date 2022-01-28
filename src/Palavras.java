import java.util.Scanner;

public class Palavras {
    public static void cadastrar(String[][] temas) {
        Temas.existentes(temas);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tema em que deseja cadastrar a palavra:");
        String tema = sc.next();
        for (int i = 0; i < 50; i++) {
            if (temas[i][0] == null) {
                System.out.println("Tema nao encontrado");
            } else {
                if (temas[i][0].equals(tema)) {
                    System.out.println("Tema " + temas[i][0] + " encontrado!");
                    System.out.println("Digite a palavra que deseja cadastrar:");
                    String palavra = sc.next();
                    if (Palavras.achaIndiceP(temas, palavra) == -1) {
                        System.out.println("Nao e possivel cadastrar palavra repetida");
                    } else {
                        temas[i][Quantidade.palavrasTema[i]] = palavra;
                        Quantidade.palavrasTema[i]++;
                        System.out
                                .println(
                                        "Palavra cadastrada!\nRetorne ao menu para cadastrar outra palavra ou para sair:");
                        Menu.gerenciarTemas(temas);
                    }
                    break;
                }
            }
        }
    }

    public static void buscarP(String[][] temas) { // deixar a busca global e nao buscar pelo tema
        int idx;
        Temas.existentes(temas);
        System.out.println("Digite o tema em que deseja buscar a palavra:");
        Scanner sc = new Scanner(System.in);
        String palavraPesquisa = sc.next();
        idx = Palavras.achaIndiceP(temas, palavraPesquisa);
        if (idx == -1) {
            System.out.println("Palavra nao encontrada");
        } else {
            System.out.println("Palavra " + palavraPesquisa + " encontrada no tema " + temas[idx][0]);
        }
        Menu.gerenciarPalavras(temas);
    }

    // }

    public static void listarP(String[][] temas) {
        int idx;
        Temas.existentes(temas);

        System.out.println("Entre os temas a seguir, insira o tema em que deseja a listagem:");
        for (int i = 0; i < Quantidade.temas; i++) {
            if (temas[i][0] != null) {
                System.out.println(temas[i][0]);
            }
        }
        Scanner sc = new Scanner(System.in);
        String temaPesquisa = sc.next();
        idx = Temas.achaIndice(temas, temaPesquisa);
        if (idx == -1) {
            System.out.println("Tema nao encontrado");

        } else {
            System.out.println("Palavras no tema " + temas[idx][0] + ":");
            for (int i = 0; i < Quantidade.temas; i++) {
                for (int j = 1; j <= Quantidade.palavrasTema[idx]; j++) {
                    if (temas[idx][j] != null) {
                        Quantidade.palavrasTema[i]++;
                        System.out.println(temas[idx][j]);

                    }
                }
                Menu.gerenciarPalavras(temas);
            }

        }

        if (idx == -1)

        {
            System.out.println("Palavra nao encontrada");

        } else {

        }
    }

    public static void deletarP(String[][] temas) { // arrumar isso
        int idx;
        Temas.existentes(temas);
        System.out.println("Insira o tema que deseja excluir:");
        Scanner sc = new Scanner(System.in);
        String temaPesquisa = sc.next();
        idx = Temas.achaIndice(temas, temaPesquisa);
        if (idx == -1) {
            System.out.println("Tema nao encontrado");
        } else {

            if (idx == Quantidade.temas - 1) {
                for (int j = 0; j <= Quantidade.palavrasTema[idx]; j++) {
                    temas[idx][j] = null;
                }

            } else {
                for (int i = idx; i < Quantidade.temas - 1; i++) {
                    for (int j = 0; j <= Quantidade.palavrasTema[i]; j++) {
                        temas[i][j] = temas[i + 1][j];
                    }
                }

            }
            Quantidade.temas--;

        }
    }

    public static int achaIndiceP(String[][] temas, String palavraPesquisa) {
        int encontrado = -1;
        for (int i = 0; i < Quantidade.temas; i++) {
            for (int j = 1; j <= Quantidade.palavrasTema[i]; j++) {
                if (palavraPesquisa.equals(temas[i][j])) {
                    encontrado = i;
                    break;
                }
            }

        }
        return encontrado;
    }
}