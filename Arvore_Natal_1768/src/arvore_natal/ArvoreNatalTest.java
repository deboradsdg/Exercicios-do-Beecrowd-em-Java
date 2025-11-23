package arvore_natal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArvoreNatalTest {
	
	@Test
    public void testArvore5() {
        int n = 5;

        String esperado =
                "  *\n" +
                " ***\n" +
                "*****\n" +
                "  *\n" +
                " ***\n\n";

        String resultado = ArvoreNatal.gerarArvore(n);

        assertEquals(esperado, resultado);
    }
	
	@Test
    public void testArvore7() {
        int n = 7;

        String esperado =
                "   *\n" +
                "  ***\n" +
                " *****\n" +
                "*******\n" +
                "   *\n" +
                "  ***\n\n";

        String resultado = ArvoreNatal.gerarArvore(n);

        assertEquals(esperado, resultado);
    }
	
	@Test
    public void testArvore9() {
        int n = 9;

        String esperado =
                "    *\n" +
                "   ***\n" +
                "  *****\n" +
                " *******\n" +
                "*********\n"+
                "    *\n" +
                "   ***\n\n";

        String resultado = ArvoreNatal.gerarArvore(n);

        assertEquals(esperado, resultado);
    }
}
