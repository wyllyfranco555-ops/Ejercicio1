import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingresa la operación (+, -, *, /): ");
        String operacion = sc.next();

        if (operacion.equals("+")) {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (operacion.equals("-")) {
            System.out.println("Resultado: " + (num1 - num2));
        } else if (operacion.equals("*")) {
            System.out.println("Resultado: " + (num1 * num2));
        } else if (operacion.equals("/")) {
            if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        } else {
            System.out.println("Operación no válida.");
        }
    }
}