
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any of the mathematical symbols(+,-,*,/):");
        char symbol = input.next().charAt(0); //Storing mathematical symbols

        System.out.print("1st number:"); //Taking the first number
        int number1 = input.nextInt();

        System.out.print("2nd number:"); //Taking the second number

        int number2 = input.nextInt();

        if(symbol == '+'){
            System.out.print("Addition:" +(number1 + number2));
        } else if(symbol == '-'){
            System.out.print("Subtraction:" +(number1 - number2));
        } else if(symbol == '*'){
            System.out.print("Multiplication:" +(number1 * number2));
        } else if(symbol == '/'){
            System.out.print("Division:"+(number1/number2));
        }



    }
}
