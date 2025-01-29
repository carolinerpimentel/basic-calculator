package calculator;

public class app {

	public static void main(String[] args) {
		
		Calculator myCalculator = new Calculator(100, 10);
		
		int add = myCalculator.add();
		int subtract = myCalculator.subtract();
		int multiply = myCalculator.multiply();
		int divide = myCalculator.divide();
		int modulo = myCalculator.modulo();
				
		System.out.println(add + "; " + subtract + "; " + multiply + "; " + divide + "; " + modulo);
		System.out.println("");	
		System.out.println(myCalculator);
	}
}


