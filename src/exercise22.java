/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tom Adoni
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    int num1=0;
	    int num2=0;
	    int num3=0;
	    System.out.println("Enter the first number: ");
	    num1= kb.nextInt();
	    System.out.println("Enter the second number: ");
	    num2= kb.nextInt();
	    System.out.println("Enter the third number: ");
	    num3= kb.nextInt();
	    int max=0;
	    if(num1>num2 && num1>num3){
	        max=num1;
        }
	    else if(num2>num1 && num2>num3){
	        max=num2;
        }
	    else{
	        max=num3;
        }
	    System.out.println("The largest number is "+max+".");
    }
}
