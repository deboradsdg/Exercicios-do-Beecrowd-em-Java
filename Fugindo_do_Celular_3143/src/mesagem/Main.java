package mesagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int TamanhoLinha = sc.nextInt();
        sc.nextLine();

        int QtidadeLinha = 0;

        while (sc.hasNextLine()) {
            String mensagem = sc.nextLine();
            QtidadeLinha += MensagemDividida.contarLinhas(mensagem, TamanhoLinha);
        }

        System.out.println(QtidadeLinha);
        sc.close();
    }
}
