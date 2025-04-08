import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 1599.99;
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("BIENVENIDO A BANCO - HIGH CLASS");
        System.out.println("------------------------------------");

        System.out.println("NOMBRE CLIENTE: TONY STARK");
        System.out.println("TIPO DE CUENTA: CORRIENTE");
        System.out.println("SALDO DISPONIBLE: " + saldo);
        System.out.println("------------------------------------");

        while (opcion != 4) {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            System.out.println("------------------------------------");

            switch (opcion) {
                case 1:
                    System.out.println("Saldo disponible: " + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    int retiro = scanner.nextInt();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Saldo disponible: " + saldo);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    int deposito = scanner.nextInt();
                    saldo += deposito;
                    System.out.println("Depósito exitoso. Saldo disponible: " + saldo);
                    break;

                case 4:
                    System.out.println("Gracias por utilizar BANCO - HIGH CLASS.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("------------------------------------");
        }

        scanner.close();
    }
}
