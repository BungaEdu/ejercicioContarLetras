import org.example.EjercicioContarLetras;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEjercicioContarLetras {
    @Test
    public void testContarLetrasIguales() {
        char[] input = {'z', 'z', 'z', 'z', 'z'};
        String outputEsperado = "{z=5}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarLetrasAleatorio() {
        char[] input = {'a', '!', '!', ' ', 'a'};
        String outputEsperado = "{ =1, a=2, !=2}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarLetrasVacio() {
        char[] input = {};
        String outputEsperado = "{}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarLetrasWhiteSpace() {
        char[] input = {' ', ' ', ' ', ' ', ' '};
        String outputEsperado = "{ =5}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarLetrasSimbolos() {
        char[] simbolos = {'!', '|','@','#','$','~','%','&','/','(',')','?','^','`','[',']','*','+','{','}',',',';','.',':','-','_'};
        // No se admiten: =, €,¬,¿,¡,¨,´
        String outputEsperado="{@=1, [=1, ]=1, ^=1, _=1, `=1, !=1, #=1, $=1, %=1, &=1, (=1, )=1, *=1, +=1, ,=1, -=1, .=1, /=1, :=1, {=1, ;=1, |=1, }=1, ~=1, ?=1}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(simbolos);
        Assertions.assertEquals(outputEsperado, outputActual);
    }
}