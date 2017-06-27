import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum = 0;
        char contAns = ' ';


        do {
            System.out.println("Enter a number between 1 and 100: ");
            userNum = scnr.nextInt();
            if (userNum > 100) {
                System.out.println("Please enter a number between 1 and 100:");
            } else if (userNum % 2 == 1) {
                System.out.println(userNum + "Odd");
                // write your code here lets add more comments
            } else if (userNum % 2 == 0 && userNum > 1 && userNum < 25) {
                System.out.println(" Even and less than 25.");
            } else if (userNum % 2 == 0 && userNum > 25 && userNum < 61) {
                System.out.println("Even");
            } else if (userNum % 2 == 0 && userNum > 60 && userNum < 101) {
                System.out.println(userNum + " Even");
            } else if (userNum % 2 == 1 && userNum > 60 && userNum < 101) {
                System.out.println(userNum + " Odd and over 60");
            }
            System.out.println("continue y/n: ");
            contAns = scnr.next().charAt(0);

        } while (contAns == 'y');


    }
}