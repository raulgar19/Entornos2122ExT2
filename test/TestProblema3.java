import org.junit.jupiter.api.Test;

public class TestProblema2 {
    @Test
    public void devuelve_cadena_de_multipos(){
        //Arrange
        Problema2 problema2 = new Problema2();

        //Act
        problema2.programa(5);

        //Asserts
        Assert.equals("1FizzBuzz3Fizz5Buzz", devuelve_cadena_de_multipos());
    }
}