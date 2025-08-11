import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Actividad 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una nota: ");
        int nota = scanner.nextInt();
        System.out.println("Ingresa otra nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Ingresa una nota mas: ");
        int nota3 = scanner.nextInt();

        double promedio = (double)(nota + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);

        //Actividad 2
        System.out.println("Ingresa un nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingresa una edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingresa un nacionalidad: ");
        String nacionalidad = scanner.next();
        System.out.println("Ingresa una ocupacion: ");
        String ocupacion = scanner.next();
        System.out.println("Ingresa salario: ");
        int salario = scanner.nextInt();

        int calcularañio = 2025 - edad;
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
        System.out.println("La nacionalidad es: " + nacionalidad);
        System.out.println("La ocupacion es: " + ocupacion);
        System.out.println("El salario es: " + salario);
        System.out.println("El año de nacimiento es: " + calcularañio);
    }


}

