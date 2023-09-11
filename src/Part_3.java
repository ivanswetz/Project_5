import java.util.Scanner;

public class Part_3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Welcome to Basic Calculator! \n -----------------------------------------------------");
        askUser();
    }
    public static double plus(double num_1, double num_2){
        double sum = num_1 + num_2;
        return sum;
    }
    public static double minus(double num_1, double num_2){
        double ret = num_1 - num_2;
        return ret;
    }
    public static double multiply(double num_1, double num_2){
        double mul = num_1 * num_2;
        return mul;
    }
    public static double divide(double num_1, double num_2){
        double div = num_1 / num_2;
        return div;
    }
    public static double square(double num_1){
        double sqr = num_1 * num_1;
        return sqr;
    }
    public static double root(double num_1){
        java.lang.Math.sqrt(num_1);
        return num_1;
    }
    public static void print(double result){
        System.out.println(result);
    }
    public static void askUser(){
        System.out.print("Input first value: ");
        double num_1 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Input operation that you want to perform(+ plus, - minus, * multiply, / divide, ^ square, % square root: ");
        String operator = scan.nextLine();
        while (!operator.contains("+") && !operator.contains("-") && !operator.contains("*") && !operator.contains("/") && !operator.contains("^") && !operator.contains("%")){
            System.out.println("Wrong operator, try again!");
            operator = scan.nextLine();
        }
        double num_2 = 0;
        if(operator != "^" && operator != "%"){
            System.out.print("Input second value: ");
            num_2 = scan.nextDouble();
        }
        scan.nextLine();
        calculation(num_1, num_2, operator);
        askUserContinue();
    }
    public static void calculation(double num_1, double num_2, String operator){
        switch (operator){
            case "+":
                print(plus(num_1, num_2));
            case "-":
                print(minus(num_1, num_2));
            case "*":
                print(minus(num_1, num_2));
            case "/":
                print(divide(num_1, num_2));
            case "^":
                print(square(num_1));
            case "%":
                print(root(num_1));
        }
    }
    public static void askUserContinue(){
        for(int i = 0; ;i++){
            System.out.println("Do you want to continue?");
            String choice = scan.nextLine();
            if(choice.equals("Y") || choice.equals("y")){
                askUser();
            } else if (choice.equals("N") || choice.equals("n")) {
                System.out.println("Thanks for using program!");
                break;
            }
            else {
                System.out.println("shutting down");
                break;
            }
        }
    }
}
