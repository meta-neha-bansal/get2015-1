package intIntegerDifference;

public class Demo {

	public static void main(String[] args) {
		Integer value1 = 4;
		int value2=6;
		System.out.println("Value1 in main before updateInteger : "+value1);
		System.out.println("Value2 in main before updateInteger : "+value2);
		updateInteger(value1,value2);
		System.out.println("Value1 in main after updateInteger : "+value1);
		System.out.println("Value2 in main after updateInteger : "+value2);
	}


	public static void updateInteger(Integer v1, int v2) {
		System.out.println("Value1 in function before update : "+v1);
		System.out.println("Value2 in function before update : "+v2);
		v1= 5;
		v2=7;
		System.out.println("Value1 in function after update : "+v1);
		System.out.println("Value2 in function after update : "+v2);
	}
}