public class TestProblema1 {
    @Test
    public void si_es_multiplo_de_3(){
        Problema1 problema1 = new Problema1();
        problema1.programa(9);
        Assert.equals("Fizz", si_es_multiplo_de_3());
    }
    @Test
    public void si_es_multiplo_de_5(){
        Problema1 problema1 = new Problema1();
        problema1.programa(25);
        Assert.equals("Buzz", si_es_multiplo_de_5());
    }
}