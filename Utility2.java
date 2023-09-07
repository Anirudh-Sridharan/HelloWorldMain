public class Utility2 { 
	public static void printHelloWorld(String arg) { 
		if (arg.equalsIgnoreCase("hello")){
			System.out.println("Hello World!");
		} else if (arg.equalsIgnoreCase("goodbye")){
			System.out.println("Goodbye, cruel world!");
		} else {
			System.out.println("No hello or goodbye.");
		}
	} 
}
