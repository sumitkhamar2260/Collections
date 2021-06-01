package com.cts.function;

import java.util.function.Supplier;

public class TestSupplier {
 public static void main(String[] args) {
	Supplier<Double> supplier=()->{
		return Math.random();
	};
	System.out.println(supplier.get());
	supplier=Math::random;//static method refercnce
}
}
