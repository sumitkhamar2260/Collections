package com.cts.lambdas;

class Messenger{
     String message;
	public Messenger(){
		message="this is interesting";
	}
	Messenger(String message){
		this.message=message;
	}
}
interface Compute{
	public int add(int a, int b);
}
interface Communicate{
	public Messenger sendMessage();
}
class Arithmetic{
	public  int plus(int i, int j) {
		return i+j;
	}
	
	/*
	 * public static int plus(int i, int j) { return i+j; }
	 */
}
public class TestMethodRefs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Arithmetic arithObj = new Arithmetic();
		Compute comp=arithObj::plus;//static method refference
           int result = comp.add(12,54);
           System.out.println(result);
            
           
           
           Communicate comm = Messenger::new;//constructor reference
           Messenger messenger=comm.sendMessage();
           System.out.println(messenger.message);
			/*
			 * Compute comp=Arithmetic::plus;//static method refference int result =
			 * comp.add(12,54); System.out.println(result);
			 */
	}

}
