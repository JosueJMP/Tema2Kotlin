
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;


public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("13. Ejercicio 13");
            System.out.println("14. Ejercicio 14");
            System.out.println("0 Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    Ejercicio4();
                    break;
                case 5:
                    Ejercicio5();
                    break;
                case 6:
                    Ejercicio6();
                    break;
                case 7:
                    Ejercicio7();
                    break;
                case 8:
                    Ejercicio8();
                    break;
                case 9:
                    Ejercicio9();
                    break;
                case 10:
                    Ejercicio10();
                    break;
                case 11:
                    Ejercicio11();
                    break;
                case 12:
                    Ejercicio12();
                    break;
                case 13:
                    Ejercicio13();
                    break;
                case 14:
                    Ejercicio14();
                    break;
                case 0:
                    System.out.println("Hasta la vista ....");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }

    // Ejercicio 1: Saludo personalizado
    public static void Ejercicio1() {
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
    }

    // Ejercicio 2: Número par o impar
    public static void Ejercicio2() {
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    // Ejercicio 3: Cálculo del área de un círculo
    public static void Ejercicio3() {
        System.out.print("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();
        double area = PI * pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }

    // Ejercicio 4: Generador de números aleatorios
    public static void Ejercicio4() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Adivina el número (entre 1 y 100): ");
            intento = sc.nextInt();
            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            }
        } while (intento != numeroAleatorio);

        System.out.println("¡Correcto! El número era " + numeroAleatorio);
    }

    // Ejercicio 5: Tabla de multiplicar
    public static void Ejercicio5() {
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Ejercicio 6: Sumar números del 1 al 100
    public static void Ejercicio6() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }

    // Ejercicio 7: Reverso de una cadena
    public static void Ejercicio7() {
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();
        String reverso = new StringBuilder(cadena).reverse().toString();
        System.out.println("El reverso de la cadena es: " + reverso);
    }

    // Ejercicio 8: Contador de vocales
    public static void Ejercicio8() {
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine().toLowerCase();
        int contador = 0;
        for (char c : frase.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales.");
    }

    public static void Ejercicio9() {
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static void Ejercicio10() {

        int opcion;
        do {
            System.out.println("Qué conversor quiere utilizar:");
            System.out.println("1. De Celsius a Fahrenheit");
            System.out.println("2. De Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    AFahrenheit();
                    break;
                case 2:
                    Acelsius();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    // Convertir de Celsius a Fahrenheit
    public static void AFahrenheit() {
        System.out.print("Ingrese temperatura en Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
    }

    // Convertir de Fahrenheit a Celsius
    public static void Acelsius() {
        System.out.print("Ingrese temperatura en Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperatura en Celsius: " + celsius);
    }

    public static void Ejercicio11() {
        System.out.print("Ingresa el número N para la secuencia de Fibonacci: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Por favor, ingrese un número positivo.");
        } else {
            System.out.println("Los primeros " + N + " números de la secuencia de Fibonacci son:");
            int a = 0, b = 1;
            System.out.print(a + " ");
            for (int i = 1; i < N; i++) {
                System.out.print(b + " ");
                int temp = a;
                a = b;
                b = temp + b;
            }
            System.out.println();
        }
    }

    public static void Ejercicio12() {
        System.out.print("Introduce un número de mas de 2 digitos ");
        int numero = sc.nextInt();
        System.out.println("Su número invertido es: " + new StringBuilder(String.valueOf(numero)).reverse().toString());
    }

    public static void Ejercicio13(){
        String nombre ;
        int numeroEpisocios;
        String genero;

        System.out.println("Procedemos a crear un Objeto tipo Anime");
        System.out.println("Introduce el nombre del anime");
        nombre = sc.nextLine();
        System.out.println("Introduce el numero de episodios");
        numeroEpisocios = sc.nextInt();
        System.out.println("Introduce el genero del anime");
        genero = sc.nextLine();
        Anime anime1 = new Anime(nombre, numeroEpisocios, genero);
        System.out.println("Se ha creado exitosamente");
    }

    public static void Ejercicio14() {

        ArrayList<Videojuegos> inventario = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\nMenú de Inventario de Videojuegos:");
            System.out.println("1. Añadir videojuego");
            System.out.println("2. Eliminar videojuego");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir del inventario");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Añadir videojuego
                    System.out.print("Introduce el título del videojuego: ");
                    String titulo = sc.nextLine();
                    System.out.print("Introduce la plataforma del videojuego: ");
                    String plataforma = sc.nextLine();
                    System.out.print("Introduce las horas del juego ");
                    int horasJugadas = sc.nextInt();
                    sc.nextLine();  // Limpiar el buffer

                    Videojuegos nuevoVideojuego = new Videojuegos(titulo, plataforma, horasJugadas);
                    inventario.add(nuevoVideojuego);
                    System.out.println("Videojuego añadido con éxito.");
                    break;

                case 2:
                    // Eliminar videojuego
                    System.out.print("Introduce el título del videojuego a eliminar: ");
                    String tituloEliminar = sc.nextLine();
                    boolean eliminado = false;

                    for (int i = 0; i < inventario.size(); i++) {
                        if (inventario.get(i).getTitulo().equalsIgnoreCase(tituloEliminar)) {
                            inventario.remove(i);
                            eliminado = true;
                            System.out.println("Videojuego eliminado con éxito.");
                            break;
                        }
                    }

                    if (!eliminado) {
                        System.out.println("No se encontró un videojuego con ese título.");
                    }
                    break;

                case 3:
                    // Mostrar inventario
                    if (inventario.isEmpty()) {
                        System.out.println("El inventario está vacío.");
                    } else {
                        System.out.println("Inventario de Videojuegos:");
                        for (Videojuegos videojuego : inventario) {
                            System.out.println(videojuego);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del inventario...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
    }
}


