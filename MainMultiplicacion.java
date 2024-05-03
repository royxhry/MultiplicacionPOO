import java.util.Scanner;

public class MainMultiplicacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiplicacion m1 = new Multiplicacion();

        System.out.println("Ingresa el primer número: ");
        int a = scanner.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int b = scanner.nextInt();


        int r = m1.multiplicar(a,b);
        System.out.println("El resultado de la multiplicacion es " + r);

        scanner.close();
    }
    
}
