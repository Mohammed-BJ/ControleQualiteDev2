import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class StatistiqueTest {

    @Test
    public void testMoyenneAvecMock() {
        Calculatrice mockCalc = mock(Calculatrice.class);
        when(mockCalc.add(4.0f, 2.0f)).thenReturn(6.0f);
        when(mockCalc.div(6.0f, 2)).thenReturn(3.0f);

        Statistique stat = new Statistique();
        stat.calculatrice = mockCalc;

        assertEquals(3.0f, stat.moyenne(4.0f, 2.0f));
    }
}
