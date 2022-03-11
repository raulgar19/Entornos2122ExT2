public class Problema2 {
    static String programa(int num) {
        String res = "";
        for (int i = 1; i <= num; i++){
            if (num % 3 == 0){
                res += num + "Fizz";
            }
            if (num % 5 == 0){
                res += num + "Buzz";
            }
            if (num % 3 == 0 && num % 5 == 0){
                res += num + "BuzzFizz";
            }
            else{

            }
        }
        return res;
    }
}