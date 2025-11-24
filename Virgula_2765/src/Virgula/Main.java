package Virgula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();

            String[] partes = Virgula.separar(linha);

            System.out.println(partes[0]);
            System.out.println(partes[1]);
        }

        sc.close();
    }
}