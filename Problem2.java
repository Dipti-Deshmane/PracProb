package PracProb;

import java.util.Scanner;
public class Problem2 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        double a =sc.nextDouble();
        if(a >= 0){
            double b = a+10;
            System.out.println("Answer is "+b);
        }
        else {
            System.out.println("Please enter positive number");
        }

    }
}
