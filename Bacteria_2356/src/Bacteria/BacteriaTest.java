package Bacteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BacteriaTest {
	
	@Test
    public void testeA() {
        assertEquals("Resistente",
                Bacteria.verificar("ACGTTGCA", "TTG"));
    }
	
	@Test
    public void testeB() {
        assertEquals("Resistente",
                Bacteria.verificar("ACGT", "ACGT"));
    }
	
	@Test
    public void testeC() {
        assertEquals("Nao resistente",
                Bacteria.verificar("ACGTTGA", "AAC"));
    }
}
