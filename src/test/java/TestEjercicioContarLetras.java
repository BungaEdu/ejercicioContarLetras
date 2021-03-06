import org.example.EjercicioContarLetras;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEjercicioContarLetras {
    @Test
    public void testContarLetrasIguales() {
        String input = "aaaaaaaa";
        String outputEsperado = "{z=5}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    //El Test falla porque no he conseguido meter el toLowerCase en el procedimiento contarRepeticiones
    //En el programa funciona bien porque está controlado, pero no se programarlo para que entre en el test
    @Test
    public void testContarLetrasMinusMayus() {
        String input = "PpPpr";
        String outputEsperado = "{p=3,r=2}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(input);
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    //Se tiene que hacer obligatoriamente por String, antes tenías la función en char
    //Ahora lo tienes en string, por lo que es mejor.
    //"((HAY QUE CORREGIRLO))""
    @Test
    public void testContarLetrasAleatorio() {
        char[] input = {'a', '!', '!', ' ', 'a'};
        String outputEsperado = "{ =1, a=2, !=2}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(String.valueOf(input));
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarLetrasVacio() {
        char[] input = {};
        String outputEsperado = "{}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(String.valueOf(input));
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    @Test
    public void testContarLetrasWhiteSpace() {
        char[] input = {' ', ' ', ' ', ' ', ' '};
        String outputEsperado = "{ =5}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(String.valueOf(input));
        Assertions.assertEquals(outputEsperado, outputActual);
    }

    //Muchos de los símbolos que no se admiten están en ASCII, por lo que no se por qué no se admiten
    @Test
    public void testContarLetrasSimbolos() {
        char[] simbolos = {'!', '|','@','#','$','~','%','&','/','(',')','?','^','`','[',']','*','+','{','}',',',';','.',':','-','_'};
        // No se admiten: =, €,¬,¿,¡,¨,´
        String outputEsperado="{@=1, [=1, ]=1, ^=1, _=1, `=1, !=1, #=1, $=1, %=1, &=1, (=1, )=1, *=1, +=1, ,=1, -=1, .=1, /=1, :=1, {=1, ;=1, |=1, }=1, ~=1, ?=1}";
        String outputActual = EjercicioContarLetras.contarRepeticiones(String.valueOf(simbolos));
        Assertions.assertEquals(outputEsperado, outputActual);
    }
}