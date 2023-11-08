
package socialclub;

import java.util.ArrayList;

public class Club {
    //creacion de lista para los socios
    public ArrayList<Member> members = new ArrayList<>();
    public int maxMember = 35;

    public Club() {
    }
      
    //metodo para afiliar un socio
    public boolean affiliateMember(String Id, String Name, String subscriptionType) {
        // Verificar si ya existe un socio con la misma cédula
        for (Member member : members) {
            if (member.getId().equals(Id)) {
                System.out.println("Ya existe un socio con la misma cédula.");
                return false;
        }
    }

    //fondos iniciales
        double initialFunds = (subscriptionType.equals("VIP")) ? 100000 : 50000;
        members.add(new Member(Id, Name, initialFunds, subscriptionType));
        System.out.println("Socio afiliado con éxito.");
        return true;
    }
    
    // metodo para registrar a persona autorizada
    public void registerAuthorizedPerson(String idMember1, String nameAuthorized1) {
        for (Member member : members) {
            if (member.getId().equals(idMember1)) {
                member.addAuthorizedPerson(nameAuthorized1);
                System.out.println("Persona autorizada registrada con éxito.");
                return;
            }
        }
        System.out.println("No se encontró al socio con la cédula especificada.");
    }

    // metodo para pagar factura
    public boolean payBill(String idMember2, String concept1, double value1, String nameAuthorized2) {
        for (Member member : members) {
            if (member.getId().equals(idMember2)) {
                member.payBill(new Bill(concept1, value1, nameAuthorized2));
                System.out.println("Factura pagada con éxito.");
                return true;
            }
        }
        System.out.println("No se encontró al socio con la cédula especificada.");
        return false;
    }
    
    //metodo para aumentar fondos
    public void registerConsumption(String idMember3, String concept2, double value2, String nameAuthorized3) {
        for (Member member : members) {
            if (member.getId().equals(idMember3)) {
                member.registerConsumption(concept2, value2, nameAuthorized3);
                System.out.println("Consumo registrado en la cuenta del socio.");
                return;
            }
        }
        System.out.println("No se encontró al socio con la cédula especificada.");
    }
    
    //metodo para aumentar fondos
    public boolean increaseFund(String idMember4, double amount) {
        for (Member member : members) {
            if (member.getId().equals(idMember4)) {
                member.increaseFunds(amount);
                System.out.println("Fondos aumentados con éxito.");
                return true;
            }
        }
        System.out.println("No se encontró al socio con la cédula especificada.");
        return false;
    }
    

    //metodo para eliminar un socio
    public boolean deleteMember(String idMember5) {
        for (Member member : members) {
            if (member.getId().equals(idMember5)) {
                members.remove(member);
                System.out.println("Socio eliminado con éxito.");
                return true;
            }
        }
        System.out.println("No se encontró al socio con la cédula especificada.");
        return false;
    }

    public void listMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }
}


