package PracProb;

import java.util.Scanner;

public class OperatorProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int a =sc.nextInt();

        if(a%2==0){
            System.out.println(a+" is even number ");

        }
        else {
            System.out.println(a+" is odd number");
        }

       }

    }

