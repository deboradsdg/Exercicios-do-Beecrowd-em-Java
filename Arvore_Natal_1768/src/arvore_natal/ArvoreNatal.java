package arvore_natal;

public class ArvoreNatal {
	
	

    public static String gerarArvore(int n) {
        StringBuilder sb = new StringBuilder();

       
        int esp = n / 2;
        int x = 1;

        while (x <= n) {
            sb.append(" ".repeat(esp))
              .append("*".repeat(x))
              .append("\n");
            esp--;
            x += 2;
        }

 
        sb.append(" ".repeat(n / 2)).append("*").append("\n");
        sb.append(" ".repeat((n / 2) - 1)).append("***").append("\n\n");

        return sb.toString();
    }
}
