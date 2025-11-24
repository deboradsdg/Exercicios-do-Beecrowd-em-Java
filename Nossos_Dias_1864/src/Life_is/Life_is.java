package Life_is;
import java.util.Scanner;

public class Life_is {
	private static final String FRASE = "LIFE IS NOT A PROBLEM TO BE SOLVED";

    public static String extrair(int n) {
        return FRASE.substring(0, n);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.print(extrair(n));
		sc.close();
	}

}
