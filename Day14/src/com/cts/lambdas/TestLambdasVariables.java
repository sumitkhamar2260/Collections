package com.cts.lambdas;

public class TestLambdasVariables {
	private int data;
	private static int result;
	void method() {
		int local=20;
Comparable comp = (Object obj)->{
			
			
			data=100;
			result=200;
			result=local;
			return 0;
		};
	}
	
	public static void main(String[] args) {
	     final int local=20;
		Comparable comp = (Object obj)->{
			
			TestLambdasVariables tld = new TestLambdasVariables();
			tld.data=100;
			result=200;
			result=local;
			return 0;
		};
		
	}

}
