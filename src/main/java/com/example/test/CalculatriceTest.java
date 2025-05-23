//Question 1)
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    Calculatrice calc = new Calculatrice();

    @Test
    public void testAdd() {
        assertEquals(7.0f, calc.add(4.0f, 3.0f));
        assertEquals(22.0f, calc.add(10.0f, 12.0f));
        assertEquals(-5.0f, calc.add(-2.0f, -3.0f));
    }

    @Test
    public void testDiv() {
        assertEquals(5.0f, calc.div(15.0f, 3.0f));
    }

    @Test
    public void testDivParZero() {
        assertThrows(ArithmeticException.class, () -> calc.div(1.0f, 0));
    }

    @Test
    public void testMult() {
        assertEquals(6.0f, calc.mult(2.0f, 3.0f));
        assertEquals(-12.0f, calc.mult(-2.0f, 6.0f));
        assertEquals(12.0f, calc.mult(-2.0f, -6.0f));

    }
}
//questions 2)
@Test
public void testMinus() {
    assertEquals(2.0f, calc.minus(5.0f, 3.0f));
    assertEquals(-1.0f, calc.minus(2.0f, 3.0f));
    assertEquals(5.0f, calc.minus(-5.0f, -10.0f));
}
//Voir l'ajout de minus dans le fichier calculatrice.java
