package assignments;

import java.util.Scanner;

public class KNUST_grading_system {
    public static void main(String[] args){

        //Requirement 1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your exam score:"); //exam score
        int exam_score = input.nextInt();

        System.out.println("Enter your assessment score:"); //assessment score
        int assessment_score = input.nextInt();

        //Conditions for a student to get a certificate
        if(exam_score >= 25 && assessment_score >= 15){
            System.out.println("Certificate granted");
        } else{
            System.out.println("Certificate not granted");
        }

        //Requirement 2
        if((exam_score == 25 && assessment_score == 14) || (exam_score == 24 && assessment_score == 15)){
            System.out.println("You're condoned");
        } else{
            System.out.println("You're not condoned");
        }

    }
}
