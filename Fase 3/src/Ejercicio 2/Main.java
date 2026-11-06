package ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE LA CLASE RECTÁNGULO ===");
        
        // Crear un rectángulo normal
        Rectangulo r1 = new Rectangulo(4.0, 6.0);
        r1.mostrar();

        // Crear un cuadrado (base y altura iguales)
        Rectangulo r2 = new Rectangulo(5.0, 5.0);
        r2.mostrar();
    }
}
