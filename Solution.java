public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.isPrime(2)); 
        System.out.println(Solution.isPrime(0)); 
        System.out.println(Solution.isPrime(1)); 
        System.out.println(Solution.isPrime(31));
    
    }

    public static boolean isPrime(int number1){

        if(number1 <= 1){
            return false;
        }

        for (int i = 2; i <= number1/2; i++){
            if ((number1 % i) == 0){
                return false;
            }
        }
        return true;
    }
    
    
}
