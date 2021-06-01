package com.cts.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;


public class TestConsumer {
	static void processConsumer(List<String> stringList, Consumer<String> conRef){
		for(String str:stringList){
		conRef.accept(str);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Sumit", "jadeja", "dhoni");
		Consumer<String> consumer=(str)->{System.out.println(str.toUpperCase());};
		//processConsumer(list,consumer);
		
		list.forEach(consumer);//consumer function
		list.forEach(System.out::println);//method reference
	}

}
