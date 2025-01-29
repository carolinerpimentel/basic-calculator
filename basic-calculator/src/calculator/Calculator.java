package calculator;

// This program adds, subtracts, multiplies, divides and displays the remainder between two integers

public class Calculator {
	
	int a, b;
	
	//Constructor
		public Calculator(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		public int add() {
			return a + b;
		}
		
		public int subtract() {
			return a - b;
		}
		
		public int multiply() {
			return a * b; 
		}
		
		public int divide() {
			return a / b;
		}
		
		public int modulo() {
			return a % b;	
		}
		
		public String toString() {
			return a + " + " + b + " = " + add() + "\n" + a + " - " + b + " = " + subtract() + "\n" + a + " * " + b + " = " + multiply() + "\n" + a + " / " + b + " = " + divide() + "\n" + a + " % " + b + " = " + modulo();
		}

}
