package com.cts.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
	
	static List<String> processPredicate(List<String> stringList,Predicate<String> predicate){
		List<String> strsList=new ArrayList<>();
		for(String str:stringList){
			if(predicate.test(str)){
				strsList.add(str);
			}
		}
		return strsList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Tom","Jerry","Oswald","Henry","Kristina","Dora");

		Predicate<String> predicate=(str)->{
			return str.length()>5;
		};
		List<String> lenList=processPredicate(list,predicate);
		System.out.println(lenList);
	}

}
