public class Example {

	public static void main(String[] args) {
	
		int num1 = 200;
		int num2 = 100;
		
		System.out.println("Before swapping " + num1 + "," + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After swapping " + num1 + "," + num2);
	}

}