package Life_is;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Teste_Life_is {
	 @Test
	    public void testExtrair5() {
	        assertEquals("LIFE ", Life_is.extrair(5));
	    }

	    @Test
	    public void testExtrair10() {
	        assertEquals("LIFE IS NO", Life_is.extrair(10));
	    }

	    @Test
	    public void testExtrair34() {
	        assertEquals("LIFE IS NOT A PROBLEM TO BE SOLVED", Life_is.extrair(34));
	    }
}
