import java.util.Scanner;

public class Grade_checker {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score:");
        int score = input.nextInt();
        if(score >= 70){
            System.out.println("You had an A");
        } else if (score >= 60){
            System.out.println("You had a B");
        } else if (score >= 50){
            System.out.println("You had a C");
        } else if(score >= 40){
            System.out.println("You had a D");
        } else {
            System.out.println("You failed");
        }
    }
}
