public class Multiplicacion {
    // Variables para los valores y el resultado de la multiplicación
    private int a, b, r;
    
    // Método para obtener el valor 'a'
    public int getA() {
        return a;
    }
    
    // Método para establecer el valor 'a'
    public void setA(int a) {
        this.a = a;
    }
    
    // Método para obtener el valor 'b'
    public int getB() {
        return b;
    }
    
    // Método para establecer el valor 'b'
    public void setB(int b) {
        this.b = b;
    }
    
    // Método para realizar la multiplicación de 'a' y 'b'
    public void multiplicar() {
        this.r = a * b;
    }
    
    // Método para obtener el resultado de la multiplicación
    public int getR() {
        return r;
    }
    
    // Método toString para representar la información de la multiplicación
    @Override
    public String toString() {
        return "Multiplicacion [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
}
