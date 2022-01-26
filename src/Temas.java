import java.util.Scanner;

public class Temas {
    public static void existentes(Integer[] qtdPalavrasTema, Integer[] qtdTemas, String[][] temas) {

        for (int i = 0; i < qtdPalavrasTema.length; i++) {
            qtdPalavrasTema[i] = 10;
        }
        String[][] temas2 = new String[50][51];
        temas[0][0] = "Animal";
        temas[0][1] = "Gato";
        temas[1][0] = "Alimento";
        temas[1][1] = "Carne";
        temas[2][0] = "Parte do Corpo Humano";
        temas[2][1] = "Cabeca";
        temas[3][0] = "Esportes";
        temas[4][0] = "Profissoes";
        qtdTemas[0] = 50; // 0 e a primeira posicao, descobrir como esconder os null nessa porra

        for (int i = 0; i < qtdTemas[0]; i++) {
            for (int j = 1; j <= 10; j++) {
                temas[i][j] = temas[i][0] + " " + j;
                qtdPalavrasTema[i]++;
            }
        }

    }

    public static String cadastrar(Integer[] qtdPalavrasTema, Integer[] qtdTemas, String[][] temas) {
        Scanner sc = new Scanner(System.in);
        String tema = "";
        System.out.println("Insira o tema que deseja cadastrar:");
        tema = sc.next();
        for (int i = 0; i < 50; i++) {
            if (temas[i][0] == null) {
                temas[i][0] = tema;
                qtdTemas[0]++;
                System.out.println("Tema cadastrado!");
                break;
            }
        }
        return tema;

    }

    public static void buscarT(Integer[] qtdPalavrasTema, Integer[] qtdTemas, String[][] temas) {
        int idx;
        System.out.println("Insira o tema que deseja buscar:");
        Scanner sc = new Scanner(System.in);
        String temaPesquisa = sc.next();
        idx = achaIndice(temas, temaPesquisa, qtdTemas);
        if (idx == -1) {
            System.out.println("Tema nao encontrado");

        } else {
            System.out.println("Tema " + temas[idx][0] + " encontrado!");

        }

    }

    public static int achaIndice(String[][] temas, String temaPesquisa, Integer[] qtdTemas) {
        int encontrado = -1;
        for (int i = 0; i < qtdTemas[0]; i++) {
            if (temas[i][0].equals(temaPesquisa)) {
                encontrado = i;
                break;
            }
        }
        return encontrado;
    }

    /*
     * public static void excluir(Integer[] qtdPalavrasTema, Integer[] qtdTemas,
     * String[][] temas) {
     * System.out.println("Insira o tema que deseja excluir:");
     * Scanner sc = new Scanner(System.in);
     * String temaPesquisa = sc.nextLine();
     * for (int i = 0; i < qtdTemas[0]; i++) {
     * if (temas[i][0].equals(temaPesquisa)) {
     * System.out.println("Tema encontrado");
     * for (int j = 0; j < qtdPalavrasTema[i]; j++) {
     * temas[i][j] = ""; // vazio
     * }
     * qtdTemas[0]--;
     * break;
     * 
     * } else {
     * System.out.println("Tema não encontrado");}
     * 
     * 
     * }
     * 
     * 
     * 
     * 
     */
}
