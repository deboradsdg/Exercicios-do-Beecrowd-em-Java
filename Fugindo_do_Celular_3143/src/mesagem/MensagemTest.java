package mesagem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MensagemTest {
	
	  @Test
	    public void testeMensagemA() {
	        String msg = "Ola mundo";
	        int linhas = MensagemDividida.contarLinhas(msg, 5);
	        assertEquals(2, linhas);
	    }

	    @Test
	    public void testeMensagemB() {
	        String msg = "Bolsonaro preso hoje";
	        int linhas = MensagemDividida.contarLinhas(msg, 4);
	        assertEquals(5, linhas);
	    }

	    @Test
	    public void testeMensagemC() {
	        String msg = "BEBI DEMAIS E NAO ESTUDEI PARA A PROVA";
	        int linhas = MensagemDividida.contarLinhas(msg, 6);
	        assertEquals(7, linhas);
	    }

	  

}
