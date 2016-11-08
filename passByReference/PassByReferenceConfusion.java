package learn.general.passByReference;
/**
 * whenever a method parameter expect object, reference of that object is passed. 
 * Many programmer confuses reference with pointers here which is not correct, 
 * reference is a kind of handle which is used to locate object or change object, 
 * but it doesn’t allows any pointer arithmetic i.e. you can not increase or decrease memory address 
 * and locate a different object using reference in Java.
 *
 * in Java object can only be accessed by its reference as you can not get memory address where object is stored or 
 * more precisely there is no method to get value of object by passing memory address
 */
public class PassByReferenceConfusion {
	public static void main(String args[]){
		Car car = new Car("Bugati");
		System.out.println("car brand in main method b4 method call : " + car.brand);
		pintBrand(car);
		System.out.println("car brand in main method after method call : " + car.brand);
	}

	private static void pintBrand(Car car) {
		car.brand = "McLaren";
		System.out.println("car brand in pintBrand method : " + car.brand);
	}
}
