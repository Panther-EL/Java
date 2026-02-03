import java.util.Random;
import java.util.Scanner;

public class Number_guessing_game {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int magic_number = (int)(Math.random() * 10) +1; //Generating random numbers


        while(true){
            System.out.print("Enter your number:");
            int number = input.nextInt();


            if(magic_number == number){
                System.out.print("You are right");
                break;
            } else{
                System.out.print("Try again");
            }
        }

    }
}
