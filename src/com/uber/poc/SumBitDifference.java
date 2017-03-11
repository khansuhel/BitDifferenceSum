package com.uber.poc;

public class SumBitDifference {

	public int calculcateSum(String input) {
		int sum = 0;
		String[] inputArray = input.split(",");
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray.length; j++) {
				try{
					sum = sum + processSum(new Integer(inputArray[i]), new Integer(inputArray[j]));
				}catch(NumberFormatException ex){
					throw new NumberFormatException("Illegal input : "+input+". Terminating!");
				}
			}
		}
		return sum;
	}

	private int processSum(Integer a, Integer b) {
		int retSum = 0;
		int diff = 0;
		char[] x = Integer.toBinaryString(a).toCharArray();
		char[] y = Integer.toBinaryString(b).toCharArray();
		int i = x.length-1;
		int j = y.length-1;
		if (x.length <= y.length) {
			diff = y.length - x.length;
		} else {
			diff = x.length - y.length;
		}
		while (i >= 0 && j >= 0) {
			if (x[i] != y[j]) {
				retSum++;
			}
			i--;
			j--;
			
			if((i==0 && j>0) || (j==0 && i>0)){
				break;
			}
		}
		retSum = retSum + diff;
		return retSum;
	}

}
