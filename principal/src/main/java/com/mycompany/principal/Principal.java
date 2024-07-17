import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Flecha flecha1 = new Flecha();
        Flecha flecha2 = new Flecha(10, "rojo");
        Flecha flecha3 = new Flecha();

       
        System.out.println("Flecha 1 (por defecto):");
        flecha1.dibujar();
        System.out.println("Flecha 2 (personalizada):");
        flecha2.dibujar();
        System.out.println("Flecha 3 (por defecto):");
        flecha3.dibujar();

      
        System.out.println("\nDefina el tamaño de la nueva flecha:");
        int longitud = scanner.nextInt();
        System.out.println("Defina el color de la nueva flecha:");
        String color = scanner.next();

       
        Flecha flechaUsuario = new Flecha(longitud, color);
        System.out.println("Flecha definida por el usuario:");
        flechaUsuario.dibujar();

        scanner.close();
    }
}
