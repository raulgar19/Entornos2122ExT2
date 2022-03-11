import org.junit.jupiter.api.Test;
public class TestProblema1 {
    @Test
    public void si_es_multiplo_de_3(){

        //Arrange
        Problema1 problema1 = new Problema1();

        //Act
        problema1.programa(9);

        //Asserts
        Assert("Fizz", si_es_multiplo_de_3());
    }
    @Test
    public void si_es_multiplo_de_5(){
        //Arrange
        Problema1 problema1 = new Problema1();

        //Act
        problema1.programa(25);

        //Assert
        Assert.equals("Buzz", si_es_multiplo_de_5());
    }
}