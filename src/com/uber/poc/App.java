package com.uber.poc;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int result =0;
		SumBitDifference sumBitDifference = new SumBitDifference();
		System.out.print("Please enter a comma seperated String : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		try{
			result= sumBitDifference.calculcateSum(input);
			System.out.println("Result is : "+result);
		}catch(NumberFormatException ex){
			System.out.println(ex.getMessage());
		}
	}
}
