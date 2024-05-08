import java.util.Scanner;

public class MainMultiplicacion {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Crear un objeto de tipo Multiplicacion
        Multiplicacion m1 = new Multiplicacion();
        
        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingresa el primer número:");
        int a = sc.nextInt();
        m1.setA(a);
        
        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingresa el segundo número:");
        int b = sc.nextInt();
        m1.setB(b);

        // Realizar la multiplicación
        m1.multiplicar();

        // Obtener el resultado de la multiplicación
        int r = m1.getR();
        System.out.println("El resultado de la multiplicación es: " + r);
        System.out.println(m1.toString());
        
        // Cerrar el Scanner
        sc.close();
    }
}
