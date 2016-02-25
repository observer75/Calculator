//package lesson4;

public class Calculator_f {
		//Fields
		private double a;
		private double b;
		private double c;
		
		//Constructor
		Calculator_f(double a, double b){
			this.a = a;
			this.b = b;
		}
		//Method
		
		public double plus() {
			c = a + b;
			return c;
		}
		
		public double minus() {
			c = a - b;
			return c;
		}

		public double multiply() {
			c = a * b;
			return c;
		}
		
		public double divide() {
			c = a / b;
			return c;
		}
}
