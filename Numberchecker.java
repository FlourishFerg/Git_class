import java.util.Scanner;

public class Numberchecker {
    public static void main(String[] args) {
        while (true) {
            int count = 0;
            if (count==0) {
                System.out.println("Welcome");
                System.out.println("Select\n 1 to Check number, 2 to exit");
            } else {
                System.out.println("Do you wish to continue.....");
                System.out.println("1. Yes, 2. No");
            }
                String userchoice = new Scanner((System.in)).nextLine();
                if (userchoice.equals("1")) {
                    System.out.println("Input a number");
                    int num = new Scanner((System.in)).nextInt();

                    if (num % 2 == 0) {
                        System.out.println("the number is even");
                    }
                    if (num % 2 != 0) {
                        System.out.println("the number is odd");
                    }
                    count++;
                } else {
                    break;
                }

            }

        }
    }

