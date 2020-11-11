import java.util.Scanner;
import java.util.Locale;

public class Calculadora {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
	int res = 0;
	String a;

	do {
	System.out.print("\n");
	System.out.println("Quina operació vols fer?\n" +
		"1. Sumar\n" +
		"2. Restar\n" + 
		"3. Dividir\n" +
		"4. Multiplicar");
	System.out.print("\n");
	System.out.print("Opció: ");
	int op = scanner.nextInt();
	System.out.print("\n");
	System.out.print("Escriu un número: ");
	int num1 = scanner.nextInt();
	System.out.print("Escriu un altre número: ");
	int num2 = scanner.nextInt();

	//Suma
	if (op == 1) {
	    res = num1 + num2; 
	}
	//Resta
	else if (op == 2) {
	    res = num1 - num2;
	}
	//Divisió
	else if (op == 3) {
	    res = num1 / num2;
	}
	//Multiplicació
	else if (op == 4) {
	    res = num1 * num2;
	}

	System.out.print("\n");
	System.out.print("El resultat de l'operació és: " + res);
	System.out.println("\n");
	System.out.print("Vols fer un altra operació? ");
	a = scanner.next();
	} while (a.equals("Si") || (a.equals("si")));
	}
}
