import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra o texto: ");
        String texto = sc.nextLine();

        String textoInvertido = "";

        // Empieza en el último índice y va retrocediendo hasta 0
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido = textoInvertido + texto.charAt(i);
        }

        System.out.println("Texto invertido: " + textoInvertido);
    }
}