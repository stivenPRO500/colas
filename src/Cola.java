import java.util.Scanner;

public class Cola {

    private int[] array;
    private int size;
    private int head;
    private int tail;

    public Cola(int size) {
        this.array = new int[size];
        this.size = 0;
        this.head = 0;
        this.tail = -1;
    }

    public void encolar(int value) {
        if (size == array.length) {
            System.out.println("La cola está llena, no se puede encolar.");
            return;
        }
        tail = (tail + 1) % array.length;
        array[tail] = value;
        size++;
    }

    public void desencolar() {
        if (size == 0) {
            System.out.println("La cola está vacía, no se puede desencolar.");
            return;
        }
        head = (head + 1) % array.length;
        size--;
    }

    public int cima() {
        if (size == 0) {
            System.out.println("La cola está vacía, no hay cima.");
            return -1;
        }
        return array[head];
    }

    public int tamaño() {
        return size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la cola: ");
        int size = scanner.nextInt();

        Cola cola = new Cola(size);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Cima");
            System.out.println("4. Tamaño");
            System.out.println("0. Salir");

            System.out.print("Ingrese una opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el valor a encolar: ");
                    int value = scanner.nextInt();
                    cola.encolar(value);
                    break;
                case 2:
                    cola.desencolar();
                    break;
                case 3:
                    int cima = cola.cima();
                    if (cima != -1) {
                        System.out.println("La cima es: " + cima);
                    }
                    break;
                case 4:
                    int tamaño = cola.tamaño();
                    System.out.println("El tamaño de la cola es: " + tamaño);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
