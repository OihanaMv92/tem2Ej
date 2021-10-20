import java.util.Scanner;

public class Suma
{
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
	        int num1,num2;
	        System.out.println("Indicar un número:");
	        num1= teclado.nextInt();
	        System.out.println("Indicar el 2 número:");
	        num2= teclado.nextInt();
	        int suma = num1+num2;
	        System.out.println("La suma de los numeros son: "+ suma);
	}
}
