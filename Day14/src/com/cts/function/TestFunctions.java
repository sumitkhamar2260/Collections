package com.cts.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunctions {
	
	public static List<Integer> process(List<String> stringList, Function<String, Integer> funcParam){
		List<Integer> strLengthlist = new ArrayList<>();
		for(String str: stringList) {
			int lengthOfItem = funcParam.apply(str);
			strLengthlist.add(lengthOfItem);
		}
		return strLengthlist;
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sumit", "jadeja", "dhoni");
		Function<String, Integer> funcRef = ((String str) -> {
			return str.length();
		});
		TestFunctions tf = new TestFunctions();
		System.out.println(tf.process(list, funcRef));
	}

}
