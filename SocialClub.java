
package socialclub;

import java.util.Scanner;

public class SocialClub {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Club club = new Club();

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Afiliar un socio al club");
            System.out.println("2. Registrar una persona autorizada por un socio");
            System.out.println("3. Pagar una factura");
            System.out.println("4. Registrar un consumo en la cuenta de un socio");
            System.out.println("5. Aumentar fondos de la cuenta de un socio");
            System.out.println("6. Eliminar un socio del club");
            System.out.println("7. Listar socios");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Los siguientes datos son para afiliar un socio: \n");
                    System.out.print("Ingrese la cédula del socio: ");
                    String IdMember = scanner.nextLine();
                    System.out.print("Ingrese el nombre del socio: ");
                    String nameMember = scanner.nextLine();
                    System.out.print("Cual sera el tipo de Suscripción (VIP o Regular): ");
                    String subscriptionType = scanner.nextLine();
                    club.affiliateMember(IdMember, nameMember, subscriptionType);
                    System.out.print(" \n");
                    break;

                case 2:
                    System.out.print("Los siguientes datos son para agregar a una persona autorizada por un socio: \n");
                    System.out.print("Ingrese la cédula del socio: ");
                    String idMember = scanner.nextLine();
                    System.out.print("Escriba el nombre de la persona autorizada: ");
                    String nameAuthorized = scanner.nextLine();
                    club.registerAuthorizedPerson(idMember,nameAuthorized);
                    System.out.print(" \n");
                    break;

                case 3:
                    System.out.print("Los siguientes datos son para pagar una factura: \n");
                    System.out.print("Digite la cédula del socio: ");
                    idMember = scanner.nextLine();
                    System.out.print(" cual es el concepto de la factura: ");
                    String concept = scanner.nextLine();
                    System.out.print("Cual es el valor de factura: ");
                    double value = scanner.nextDouble();
                    System.out.print("Digite el nombre de la persona autorizada: ");
                    nameAuthorized = scanner.nextLine();
                    club.payBill(idMember, concept, value, nameAuthorized);
                    System.out.print(" \n");
                    break;

                case 4:
                    System.out.print("Los siguientes datos son para registrar un consumo en la cuenta de un socio: \n");
                    System.out.print("Cual es la cédula del socio: ");
                    idMember = scanner.nextLine();
                    System.out.print("Escriba el concepto de consumo: ");
                    concept = scanner.nextLine();
                    System.out.print("cual fue el valor del consumo: ");
                    value = scanner.nextDouble();
                    System.out.print("Nombre del autorizado: ");
                    nameAuthorized = scanner.nextLine();
                    club.registerConsumption(idMember, concept, value, nameAuthorized);
                    System.out.print(" \n");
                    break;

                case 5:
                    System.out.print("Los siguientes datos son para aumentar fondos en la cuenta de un socio: \n");
                    System.out.print("digite la cedula del socio: ");
                    idMember = scanner.nextLine();
                    System.out.print(" digite el monto para aumentar fondos: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); 
                    club.increaseFund(idMember, amount);
                    System.out.print(" \n");
                    break;

                case 6:
                    System.out.print("Los siguientes datos son para eliminar un socio: \n");
                    System.out.print(" Escriba la cédula del socio a eliminar: ");
                    idMember = scanner.nextLine();
                    club.deleteMember(idMember);
                    System.out.print(" \n");
                    break;

                case 7:
                    System.out.print("Estos son los socios existentes: ");
                    club.listMembers();
                    System.out.print(" \n");
                    break;

                case 8:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        }
    }
}