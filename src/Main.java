import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum = 0;
        char contAns = ' ';
        String userName = "";
        int userAge = 0;

        System.out.println("Please enter your name: ");
        userName = scnr.nextLine();

        System.out.println("Hello " + userName);
        System.out.println("");


        System.out.println("What is your age " + userName);
        scnr = new Scanner(System.in);
        userAge = scnr.nextInt();
        System.out.println("");


        do {
            System.out.println("Hey " + userName + " enter a number between 1 and 100: ");
            userNum = scnr.nextInt();
            if (userNum >= 100) {
                System.out.println("Please enter a number between 1 and 100:");
            } else if (userNum % 2 == 1 && userNum <= 59) {
                System.out.println(userNum + " Odd\n");
                System.out.println("Good choice that is an odd number and it is " + (Math.abs(userAge - userNum)) + " away from your age.\n");
                // write your code here lets add more comments
            } else if (userNum % 2 == 0 && userNum > 1 && userNum < 25) {
                System.out.println(" Even and less than 25.\n");
                System.out.println("Good choice that is an odd number and it is " + (Math.abs(userAge - userNum)) + " away from your age.\n");
            } else if (userNum % 2 == 0 && userNum > 25 && userNum < 61) {
                System.out.println(" Even\n");
                System.out.println("Good choice that is an odd number and it is " + (Math.abs(userAge - userNum)) + " away from your age.\n");
            } else if (userNum % 2 == 0 && userNum > 60 && userNum < 101) {
                System.out.println(userNum + " Even\n");
                System.out.println("Good choice that is an odd number and it is " + (Math.abs(userAge - userNum)) + " away from your age.\n");
            } else if (userNum % 2 == 1 && userNum > 60 && userNum < 101) {
                System.out.println(userNum + " Odd and over 60\n");
                System.out.println("Good choice that is an odd number and it is " + (Math.abs(userAge - userNum)) + " away from your age.\n");
            }
            System.out.println("continue y/n: ");
            contAns = scnr.next().charAt(0);
            if (contAns == 'n') {
                System.out.println("Good bye!!!");
            }

        } while (contAns == 'y');


    }
}