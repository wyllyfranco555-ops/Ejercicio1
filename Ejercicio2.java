import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra en minúsculas: ");
        String palabra = sc.next();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i); // Extrae la letra de la posición i

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
    }
}
