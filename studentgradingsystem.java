/**
 * 
 */
package assignment;

import java.util.Scanner;

public class assignmentQ1 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your name:  ");
        String name = a.next();
        int grade1;
        System.out.print("Enter grade 1 (0-100):  ");
        grade1 = a.nextInt();
        while (grade1 < 0 || grade1 > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            System.out.print("Enter grade 1 (0-100):  ");
            grade1 = a.nextInt();
        }
        int grade2;
        System.out.print("Enter grade 2 (0-100):  ");
        grade2 = a.nextInt();
        while (grade2 < 0 || grade2 > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            System.out.print("Enter grade 2 (0-100):  ");
            grade2 = a.nextInt();
        }
        int grade3;
        System.out.print("Enter grade 3 (0-100):  ");
        grade3 = a.nextInt();
        while (grade3 < 0 || grade3 > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            System.out.print("Enter grade 3 (0-100):  ");
            grade3 = a.nextInt();
        }
        double average = (grade1 + grade2 + grade3) / 3;
        int total = grade1 + grade2 + grade3;
        if (average >= 90) {
            System.out.println("Dear " + name + ", your total score is " + total + " and the average is " + average + " and the grade is A.");
        } else if (average >= 80) {
            System.out.println("Dear " + name + ", your total score is " + total + " and the average is " + average + " and the grade is B.");
        } else if (average >= 70) {
            System.out.println("Dear " + name + ", your total score is " + total + " and the average is " + average + " and the grade is C.");
        } else if (average >= 60) {
            System.out.println("Dear " + name + ", your total score is " + total + " and the average is " + average + " and the grade is D.");
        } else {
            System.out.println("Dear " + name + ", your total score is " + total + " and the average is " + average + " and you are failing.");
        }
        System.out.print("do you want to continue entering the grade?");
       String answer= a.next();
            System.out.println("OK! if you want, you can click 'run' to run the program again");       
    }}

