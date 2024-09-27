public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    private static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if(!isValid(num1)){
            return false;
        }
        if(!isValid(num2)){
            return false;
        }
        if(!isValid(num3)){
            return false;
        }


        int num1last = num1 % 10;
        int num2last = num2 % 10;
        int num3last = num3 % 10;

        if(num1last == num2last){
            return true;
        }
        if(num2last == num3last){
            return true;
        }
        if(num1last == num3last){
            return true;
        }

        // if(num1last == num2last && num1last == num3last){
        //     return true;
        // } else {
        //     return false;
        // }


        return false;
    }



    private static boolean isValid(int num) {
        return num >= 10 && num <= 99;
    }

}