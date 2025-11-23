package Bacteria;


public class Bacteria {

    public static String verificar(String DNA, String SEQ) {
        if (DNA.contains(SEQ)) {
            return "Resistente";
        } else {
            return "Nao resistente";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (sc.hasNextLine()) {
            String DNA = sc.nextLine().trim();
            if (!sc.hasNextLine()) break;

            String SEQ = sc.nextLine().trim();

            System.out.println(verificar(DNA, SEQ));
        }
        sc.close();
    }
}