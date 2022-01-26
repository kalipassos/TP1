import java.util.Scanner;

public class Palavras {
    public static void cadastrar(Integer[] qtdPalavrasTema, Integer[] qtdTemas, String[][] temas) {
        Temas.existentes(qtdPalavrasTema, qtdTemas, temas);
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
                    temas[i][qtdPalavrasTema[i]] = palavra;
                    qtdPalavrasTema[i]++;
                    break;
                }
            }
        }

    }

    public static void buscarP(Integer[] qtdPalavrasTema, Integer[] qtdTemas, String[][] temas) {
        int idx;

        System.out.println("Esses sao os temas disponiveis:");
        Temas.existentes(qtdPalavrasTema, qtdTemas, temas);
        for (int i = 0; i < qtdTemas[0]; i++) {
            // if (temas[i][0] != null) {
            System.out.println(temas[i][0]);

            // } else {
            // System.out.println("Nao existem temas em que seja possivel buscar palavras");
        }

        System.out.println("Insira o tema que deseja buscar:");
        Scanner sc = new Scanner(System.in);
        String temaPesquisa = sc.next();
        idx = Temas.achaIndice(temas, temaPesquisa, qtdTemas);
        if (idx == -1) {
            System.out.println("Tema nao encontrado");

        } else {
            System.out.println("Tema " + temas[idx][0] + " encontrado!");
            System.out.println("Digite a palavra que deseja buscar:");
            String palavraPesquisa = sc.next();
            for (int j = 0; j < qtdPalavrasTema[idx]; j++) {
                if (temas[idx][j].equals(palavraPesquisa)) {
                    System.out.println("Palavra" + temas[0][idx] + " encontrada no tema " + temas[idx][0]);
                    break;
                }
            }
            // }
            // System.out.println("Insira a palavra que deseja buscar:");
            // String palavraPesquisa = sc.next();
            // idx = Temas.achaIndice(temas, palavraPesquisa, qtdTemas);
            if (idx == -1)

            {
                System.out.println("Palavra nao encontrada");

            } else {

            }
        }
    }
}
