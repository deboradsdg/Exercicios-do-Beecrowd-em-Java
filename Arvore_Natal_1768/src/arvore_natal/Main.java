package arvore_natal;
import java.util.Scanner;
import arvore_natal.ArvoreNatal;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.print(ArvoreNatal.gerarArvore(n));
        }

        sc.close();
    }
}
