package labJunit.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCompteBancaire {

    @Test
    void debiterSoldePositiveValue() {
        CompteBancaire c = new CompteBancaire(10);
        assertEquals(5, c.debiterSolde(5));
    }

    @Test
    void debiterSoldeNegativeValue() {
        CompteBancaire c = new CompteBancaire(10);
        assertThrows(IllegalArgumentException.class, () -> c.debiterSolde(-5));
    }

    @Test
    void debiterSoldeSuperiorAsSolde() {
        CompteBancaire c = new CompteBancaire(10);
        assertThrows(IllegalArgumentException.class, () -> c.debiterSolde(20));
    }

    @Test
    void crediterSoldePositiveValue() {
        CompteBancaire c = new CompteBancaire(10);
        assertEquals(15, c.crediterSolde(5));
    }

    @Test
    void crediterSoldeNegativeValue() {
        CompteBancaire c = new CompteBancaire(10);
        assertThrows(IllegalArgumentException.class, () -> c.crediterSolde(-5));
    }
}
