package Calculadora;

public class Calculadora {
	private int Num1;
	private int Num2;
	
	public class Calculadora (int n1, int n2){
		private int Num1 = n1;
		private int Num2 = n2;
		
	}
	public int suma(){
		return this.Num1 + this.Num2;
	}
	public int division(){
		return (double)this.Num1 / this.Num2;
	}
	
}
