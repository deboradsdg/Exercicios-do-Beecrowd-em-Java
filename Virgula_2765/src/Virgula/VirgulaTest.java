package Virgula;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VirgulaTest {

	@Test
	public void testeA() {
		String[] resultado= Virgula.separar("Olá,Mundo");
		assertEquals("Olá", resultado[0]);
		assertEquals("Mundo", resultado[1]);
		
		
	}
	@Test
	public void testeB() {
		String[] resultado= Virgula.separar("Débora está com sono, ela deveria dormir!");
		assertEquals("Débora está com sono", resultado[0]);
		assertEquals(" ela deveria dormir!", resultado[1]);
	}
	@Test
	public void testeC() {
		String[] resultado= Virgula.separar("Java é muito chato, prefiro Python!");
		assertEquals("Java é muito chato", resultado[0]);
		assertEquals(" prefiro Python!", resultado[1]);
	}
}
