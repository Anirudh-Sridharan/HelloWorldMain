public class HelloWorld{
	public static void main(String[] args){
		try{
			Utility2.printHelloWorld(args[0]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter a paramter!");
		}
		
}
}
