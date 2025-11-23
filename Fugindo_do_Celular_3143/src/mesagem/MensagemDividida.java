package mesagem;

public class MensagemDividida {

    public static int contarLinhas(String mensagem, int TamanhoLinha) {
        int QtidadeLinha = 0;
        int i = 0;
        int tamanho = mensagem.length();

        while (i < tamanho) {
            QtidadeLinha++;
            i += TamanhoLinha;

       
            while (i < tamanho && mensagem.charAt(i) == ' ') {
                i++;
            }
        }

        return QtidadeLinha;
    }
}