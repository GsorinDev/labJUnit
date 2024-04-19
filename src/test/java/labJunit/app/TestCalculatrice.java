package labJunit.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculatrice {

    @Test
    void testSomme() {
        Calculatrice c = new Calculatrice();
        assertEquals(5, c.produit(2, 3));
    }
}
