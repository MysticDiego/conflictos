import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conflicto1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b, c;
        System.out.println("Ejemplo de Sumar tres numeros");
        System.out.println("Ingrese el valor de A:");
        a = Integer.parseInt(br.readLine());

        System.out.println("Ingrese el valor de B:");
        b = Integer.parseInt(br.readLine());

        System.out.println("Ingrese el valor de C:");
        c = Integer.parseInt(br.readLine());
        
        int resultado;
        resultado = a + b + c;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}