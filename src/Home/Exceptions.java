package Home;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Exceptions {
    public static void main(String[] args) {



    }


    public void calculate() throws Exception {
        Scanner sc = new Scanner(System.in);


            System.out.println("Enter the account number");
            int accNo = sc.nextInt();
            if (accNo >= 5) {
                System.out.println("please enter the number below 5");

            } else {
                System.out.println("your account number is correct");
            }

            System.out.println("enter the pin number");
            int pin = sc.nextInt();
            System.out.println("enter the array length");
            int no = sc.nextInt();
            int[] empdetails = new int[no];
            for (int i = 0; i < empdetails.length; i++) {
                empdetails[i] = 2000;
            }
            System.out.println(accNo / pin);

    }
}