package arvore_natal;

import java.util.Scanner;

public class Main {

    static String repete(char c, int qtd) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < qtd; i++) s.append(c);
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            int esp = n / 2;
            int x = 1;

            while (x <= n) {
                System.out.println(repete(' ', esp) + repete('*', x));
                esp--;
                x += 2;
            }

            System.out.println(repete(' ', n / 2) + "*");
            System.out.println(repete(' ', (n / 2) - 1) + "***");

            System.out.println();
        }

        sc.close();
    }
}

