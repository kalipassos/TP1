
import java.util.Scanner;
import java.util.Random;

public class Forca {
    static int count = 0;

    public static void jogo(String[] args, String[][] temas) {
        String preview = "";
        int idx;
        int erros = 0;
        int acertos = 0;
        int charAcertoQtd = 0;
        boolean acertou;
        boolean achou = false;

        Temas.existentes(temas);
        System.out.println("Selecione o tema:");
        for (int i = 0; i < Quantidade.temas; i++) {
            if (temas[i][0] != null) {
                System.out.println(temas[i][0]);
            }
        }
        Scanner sc = new Scanner(System.in);
        String temaPesquisa = sc.next();
        idx = Temas.achaIndice(temas, temaPesquisa);
        if (idx != -1) {

            System.out.println("Tema selecionado. Digite uma letra! Palavras no tema " + temas[idx][0] + ":");
            Random rand = new Random();
            String palavra = temas[idx][rand.nextInt(Quantidade.palavrasTema[idx])];
            Character[] digitadas = new Character[palavra.length()];
            Character[] charAcerto = new Character[palavra.length()];
            System.out.println(palavra);
            for (int i = 0; i < palavra.length(); i++) {
                System.out.print("_ ");
            }
            while (erros <= 5) {
                acertou = false;
                if (acertos == palavra.length()) {
                    System.out.println("Parabens! Voce acertou a palavra! Deseja jogar novamente?");
                    break;
                }
                System.out.println("\nDigite uma letra:");
                String letra = sc.next();
                if (repetida(digitadas, letra)) {
                    System.out.println("Tente outra letra!");
                } else {
                    digitadas[count] = letra.charAt(0);
                    count++;
                    for (int i = 0; i < palavra.length(); i++) {
                        if (palavra.charAt(i) == letra.charAt(0)) {
                            acertou = true;
                            acertos++;
                        }

                    }
                    if (acertou) {
                        if (!repetida(charAcerto, letra.substring(0, 1))) {
                            charAcerto[charAcertoQtd] = letra.charAt(0);
                            charAcertoQtd++;
                        }

                        for (int i = 0; i < palavra.length(); i++) {
                            for (int j = 0; j < charAcertoQtd; j++) {
                                if (palavra.charAt(i) == charAcerto[j]) {
                                    achou = true;
                                    break;
                                }
                            }
                            if (achou) {
                                System.out.print(palavra.charAt(i) + " ");
                            } else {
                                System.out.print("_ ");
                            }
                            achou = false;
                        }

                    } else {
                        System.out.println("Tente outra letra!");
                        erros++;
                    }
                }
            }
            while (erros > 5) {
                System.out.println("Voce perdeu! Deseja jogar novamente?");
                break;
            }

        }

        Menu.opcao();

    }

    public static boolean repetida(Character[] digitadas, String letra) {
        int i = 0;
        while (digitadas[i] != null) {
            if (digitadas[i] == letra.charAt(0)) {
                return true;
            }
            i++;
        }
        return false;
    }

}
