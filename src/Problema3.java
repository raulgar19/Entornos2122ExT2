public class Problema1 {
    static String programa(int num) {
        String res = "";
        if (num % 3 == 0){
            res = "Fizz";
            return res;
        }
        else {
            if (num % 5 == 0){
                res = "Buzz";
            }
                return res;
        }
    }
}