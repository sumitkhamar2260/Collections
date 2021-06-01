package com.cts.optional;

import java.util.Optional;

public class TestOptional {
	public static void main(String[] args) {
		String str=null;
		
		//Optional<String> op =Optional.of(str);
		Optional<String>op=Optional.ofNullable(str);
	   if(op.isEmpty())
		   System.out.println("string not intializes");
	   else
		System.out.println(op.get());
	   
	   String st=op.orElse("10")+"Others"+str;
	   System.out.println(st);
		
		//if(str!=null)
		//System.out.println(str.length());
		
	}

}
