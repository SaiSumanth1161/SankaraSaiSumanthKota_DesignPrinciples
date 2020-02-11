package Principles;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        int ans=0;
        System.out.printf("Enter one  of the operations from below?\n +, -, *, /\n");
        String s=sc.next();
        double result;
        if(s.charAt(0)=='+')
        	ans=Addition.add(a,b);
        else if(s.charAt(0)=='-')
        	ans=Subtraction.subtract(a,b);
        else if(s.charAt(0)=='*')
        	ans=Multiplication.multiply(a,b);
        else if(s.charAt(0)=='/')
        	ans=Division.divide(a,b);
        
        System.out.printf("The equation will be as %.2f %c %.2f = %d", a, s.charAt(0), b, ans);
    }
}
