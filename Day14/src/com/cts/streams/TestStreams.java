package com.cts.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.range(1, 11)
		.forEach(System.out::println);
		IntStream.range(1, 11)
        .forEach((x)->{System.out.println(x);});
		
	Integer sum=	IntStream.range(1, 11)
		.skip(0)
		.sum();
		
		System.out.println(sum);
		
		System.out.println("example 2");
		
		System.out.println(IntStream.range(1, 11)
		.skip(0)
		.sum());
		
		System.out.println("----------");
		
		Stream.of(89,23,54,99,1)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("----------");
		Stream.of(89,23,54,99,1)
		.sorted()
		.filter((x)->(x>50))
		.forEach(System.out::println);
		
		System.out.println("----------");
		Stream.of(89,23,54,99,1)
		.sorted()
		.filter((x)->(x>50))
		.map((x)->(x*x))
		.forEach(System.out::println);
		
		
		
		System.out.println("----------");
		Stream.of(89,23,54,99,1)
		.sorted()
		.filter((x)->(x>50))
		.map((x)->(x*x))
		.collect(Collectors.toList());
		
		
		System.out.println("----------");
	long itemCount=	Stream.of(89,23,54,99,1)
		.sorted()
		.filter((x)->(x>50))
		.map((x)->(x*x))
		.count();
	   System.out.println(itemCount);
	   
	   
	   System.out.println("Example 3");
	   
	   Arrays.stream(new String[] {"red","pink","yellow","magenta","light green"} )
	   .filter((str)->str.length()>5)
	   .sorted()
	   .map((str)->(str.toUpperCase()))
	.forEach(System.out::println);
	   
	   System.out.println("------------");
	   String colors[]={"red","pink","yellow","magenta","light green"};
	   Arrays.stream(colors )
	   .filter((str)->str.length()>5)
	   .sorted()
	   .map((str)->(str.toUpperCase()))
	.forEach(System.out::println);
	   
	   
	   System.out.println("Example5");
	   
	   List<String> list = Arrays.asList("Tom","jerry","happybirthday","coolcaptain");
			   List<String>finalList=list.stream()
					   .filter((str)->str.length()>5)
					   .sorted()
					   .map((str)->(str.toUpperCase()))
					   .collect(Collectors.toList());
			       finalList.forEach(System.out::println);
                          		
		
	}

}
