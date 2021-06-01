package com.cts.lambdas;

public class TestFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Converter con = (String from, String to, double amount)->{
			double value=0.0; 
			if(from.equals("USD")&&to.equals("Re")) {
				value=amount*75.75;
			}
			return value;
		};
		System.out.println(con.convert("USD","Re", 650));
		
		
		
		Runnable r1 =()->{
			System.out.println("Hello");
			};
			Drawable d =()->{
				System.out.println("Draw");
				};
				d.draw();
		Thread thread = new Thread(r1);
		thread.start();
            /* Drawable d = new Drawable() {
            	 public void draws() {
            		 System.out.println("hello");
            	 }
             };
             
//Thread t= new Thread(new Runnable() {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}
});
t.start();*/
}
}