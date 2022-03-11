public class Problema3 {
    private static boolean esNumeroPrimo(Integer num){
        boolean encontrado = true;
        if (num<=1) {
            encontrado= false;
        }
        if (encontrado){
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    encontrado= false;
                    break;
                }
            }
        }
        return encontrado;
    }
    static String programa(int num) {
        String res = "";
        for (int i = 1; i <= num; i++){
            if (num % 3 == 0){
                res += num + "Fizz";
                if (esNumeroPrimo(num) == true){
                    res += num + "FizzWhiz";
                }
            }
            if (num % 5 == 0){
                res += num + "Buzz";
                if (esNumeroPrimo(num) == true){
                    res += num + "BuzzWhiz";
                }
            }
            if (num % 3 == 0 && num % 5 == 0){
                res += num + "FizzBuzz";
                if (esNumeroPrimo(num) == true){
                    res += num + "FizzBuzzWhiz";
                }
            }
            else{

            }
        }
        return res;
    }
}