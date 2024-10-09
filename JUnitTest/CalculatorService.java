public class CalculatorService{

    public static int addTwoNumbers(int a, int b){
        return a+b;
    }

    public static int productTwoNumbers(int a, int b){
        return a*b;
    }

    public static int divideTwoNumbers(int a, int b){
        return a/b;
    }
    
    public static int sumNumbers(int ...num){
        int sum = 0;

        for(int a : num){
            sum += a;
        }

        return sum;
    }
    public static void main(String[] args) {
        
    }
}