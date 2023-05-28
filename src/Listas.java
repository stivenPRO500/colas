import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Colas");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Cima");
            System.out.println("4. Tamaño");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a encolar: ");
                    int elemento = scanner.nextInt();
                    queue.add(elemento);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        int elementoDesencolado = queue.remove();
                        System.out.println("El elemento desencolado es: " + elementoDesencolado);
                    } else {
                        System.out.println("La cola está vacía");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        int cima = queue.peek();
                        System.out.println("La cima de la cola es: " + cima);
                    } else {
                        System.out.println("La cola está vacía");
                    }
                    break;
                case 4:
                    System.out.println("El tamaño de la cola es: " + queue.size());
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

        scanner.close();
    }
}

