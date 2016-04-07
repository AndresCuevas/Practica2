import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un objeto de la clase calculadora
		Scanner teclado = new Scanner (System.in);
		int num1, num2, suma;
		double division;
		System.out.println("Introduce el numero 1: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el numero2: ");
		num2=teclado.nextInt();
		Calculadora calc = new Calculadora(num1, num2);
		suma = calc.suma();
		division=calc.division();
		System.out.println("La suma es: "+suma);
		System.out.println("La division es: "+division);
	}

}
