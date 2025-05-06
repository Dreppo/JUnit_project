import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(10, calc.somar(6, 4));
    }

    @Test
    public void testSubtrair() {
        assertEquals(2, calc.subtrair(5, 3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(20, calc.multiplicar(4, 5));
    }

    @Test
    public void testDividir() {
        assertEquals(2.5, calc.dividir(5, 2));
    }

    @Test
    public void testDividirPorZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}
