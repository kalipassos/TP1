import java.util.Scanner;

public class Temas {
    public static void existentes(String[][] temas) {
        for (int i = 0; i < Quantidade.palavrasTema.length; i++) {
            Quantidade.palavrasTema[i] = 0;
        }
        String[][] temas2 = new String[50][51];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 51; j++) {
                temas2[i][j] = temas[i][j];
            }
        }
        temas[0][0] = "animal";
        temas[1][0] = "alimento";
        temas[2][0] = "anatomia";
        temas[2][1] = "cabeca";
        temas[3][0] = "esportes";
        temas[4][0] = "profissoes";
        Quantidade.temas = 5; // 0 e a primeira posicao

        for (int i = 0; i < Quantidade.temas; i++) {
            for (int j = 1; j <= 10; j++) {
                temas[i][j] = temas[i][0] + " " + j;
                Quantidade.palavrasTema[i]++;
                temas[0][1] = "papagaio";
                temas[0][2] = "gato";
                temas[0][3] = "cachorro";
                temas[0][4] = "crocodilo";
                temas[0][5] = "tigre";
                temas[0][6] = "macaco";
                temas[0][7] = "cavalo";
                temas[0][8] = "porco";
                temas[0][9] = "leao";
                temas[0][10] = "anaconda";
                temas[1][1] = "carne";
                temas[1][2] = "frango";
                temas[1][3] = "pizza";
                temas[1][4] = "pudim";
                temas[1][5] = "pipoca";
                temas[1][6] = "pao";
                temas[1][7] = "queijo";
                temas[1][8] = "presunto";
                temas[1][9] = "bolo";
                temas[1][10] = "pudim";
                temas[2][2] = "cabeca";
                temas[2][3] = "olho";
                temas[2][4] = "nariz";
                temas[2][5] = "boca";
                temas[2][6] = "pescoco";
                temas[2][7] = "joelho";
                temas[2][8] = "perna";
                temas[2][9] = "unha";
                temas[2][10] = "tronco";
                temas[3][2] = "futebol";
                temas[3][3] = "basquete";
                temas[3][4] = "volei";
                temas[3][5] = "handebol";
                temas[3][6] = "futsal";
                temas[3][7] = "tenis";
                temas[3][8] = "natacao";
                temas[3][9] = "ciclismo";
                temas[3][10] = "pogobol";
                temas[4][2] = "professor";
                temas[4][3] = "engenheiro";
                temas[4][4] = "medico";
                temas[4][5] = "policial";
                temas[4][6] = "motorista";
                temas[4][7] = "programador";
                temas[4][8] = "gerente";
                temas[4][9] = "banqueiro";
                temas[4][10] = "atendente";

            }
        }
    }

    public static void cadastrar(String[][] temas) {
        Scanner sc = new Scanner(System.in);
        String tema = "";
        System.out.println("Insira o tema que deseja cadastrar:");
        System.out.println(Quantidade.temas);
        tema = sc.next();
        if (achaIndice(temas, tema) == -1) {
            System.out
                    .println("Nao foi possivel excluir o tema. Verifique se existem palavras cadastradas no sistema.");
        } else {
            temas[Quantidade.temas][0] = tema;
            Quantidade.temas++;
            System.out.println("Tema cadastrado!" + Quantidade.temas);
        }

    }

    public static void buscarT(String[][] temas) {
        int idx;
        System.out.println("Insira o tema que deseja buscar:");
        Scanner sc = new Scanner(System.in);
        String temaPesquisa = sc.next();
        idx = achaIndice(temas, temaPesquisa);
        if (idx == -1) {
            System.out.println("Tema nao encontrado");

        } else {
            System.out.println("Tema " + temas[idx][0] + " encontrado!");

        }

    }

    public static int achaIndice(String[][] temas, String temaPesquisa) {
        int encontrado = -1;
        for (int i = 0; i < Quantidade.temas; i++) {
            if (temas[i][0].equals(temaPesquisa)) {
                encontrado = i;
                break;
            }
        }
        return encontrado;
    }

    public static void deletarT(String[][] temas) {
        int idx;
        Temas.existentes(temas);
        System.out.println("Insira o tema que deseja excluir:");
        Scanner sc = new Scanner(System.in);
        String temaPesquisa = sc.next();
        idx = achaIndice(temas, temaPesquisa);
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
}
