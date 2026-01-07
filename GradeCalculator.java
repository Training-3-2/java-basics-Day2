import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the Marks : ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks >= 90 && marks <= 95 ){

            System.out.println("Grade A+");
        }

        else if (marks >= 85 && marks <= 90 ) {
            
            System.out.println("Grade A");
        }

        else if(marks >= 80 && marks <= 85){

            System.out.println("Grade B+");
        }

        else if(marks >= 75 && marks <= 80){

            System.out.println("Grade B");
        }

        else if(marks >= 60 && marks <= 70) {

            System.out.println("Grade C");
        }

        else if(marks >= 50 && marks <= 60) {

            System.out.println("Grade D");
        }

        else {

            System.out.println(" Fail");
        }


        sc.close();
    }
}
