package learn.general;
/**
 * Primitives are passed as pass by value to method parameters
 * As per Java specification everything in Java is pass by value whether its primitive value or objects 
 * and it does make sense because Java doesn't support pointers or pointer arithmetic.
 */
public class PassByValueExample {
	public static void main(String arguments[])
	{
		int number = 3;
		printNumber(number);
		System.out.println("number inside main method : " + number);
	}
	static void printNumber(int number)
	{
		number++;
		System.out.println("number inside printNumber method : " + number);
	}
}
