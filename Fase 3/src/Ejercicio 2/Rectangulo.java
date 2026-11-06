package ejercicio2;

public class Rectangulo {
    double base;
    double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Calcula el área del rectángulo
    public double calcularArea() {
        return base * altura;
    }

    // Calcula el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Verifica si es un cuadrado (si la base y la altura son iguales)
    public boolean esCuadrado() {
        return base == altura;
    }

    // Devuelve la descripción en formato de texto
    public String obtenerDescripcion() {
        return "Rectángulo de " + base + " x " + altura;
    }

    // Muestra todos los resultados por consola
    public void mostrar() {
        System.out.println(obtenerDescripcion());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("¿Es cuadrado?: " + esCuadrado());
        System.out.println("-----------------------------------");
    }
}
