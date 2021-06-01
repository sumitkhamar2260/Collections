package com.cts.lambdas;

@FunctionalInterface
public interface Drawable {
	
	public void draws();
    public default void draw() {
    	System.out.println("default");
    }
    static void method() {
    	System.out.println("static");
    }
}
