import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A BANCO - HIGTH CLASS");

        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3.Depositar dinero");
        System.out.println("4. Salir");

        System.out.println("Ingrese la opción deseada: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        int saldo = (int) 2000;

        if (opcion == 1){
            System.out.println("Saldo disponible1: " + saldo);
        } else if (opcion == 2) {
            System.out.println("Ingrese la cantidad a retirar: ");
            int Retiro = scanner.nextInt();
            if (Retiro > saldo) {
                System.out.println("Saldo insuficiente.");
            } else {
                int saldoDisp = saldo-Retiro    ;
                System.out.println("Retiro exitoso. saldo disponiblel: " + saldoDisp);
            }
        }


    }
}