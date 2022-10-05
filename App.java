import java.util.Scanner;

public class App{
    static final Scanner inputScanner = new Scanner(System.in);

    private static double getDouble(String prompt){
        System.out.println(prompt);
        double answer2 = inputScanner.nextDouble();
        return answer2;
    }


    public static void main(String[] args) {
        double num1 = getDouble("give me your 1st number.");
        inputScanner.nextLine();
        double num2 = getDouble("give me a second number.");
        //double added = Calculator.add(num1, num2);
        //System.out.println(added);
        System.out.println(Calculator.multiply(num1,num2));
    }


}