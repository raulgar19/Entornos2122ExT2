import org.junit.jupiter.api.Test;

public class TestProblema3 {
    @Test
    public void devuelve_cadena_de_multipos(){
        //Arrange
        Problema3 problema3 = new Problema3();

        //Act
        problema3.programa(5);

        //Asserts
        Assert.equals("1FizzBuzzWhizz3FizzWhizz5BuzzWhizz", devuelve_cadena_de_multipos());
    }
}