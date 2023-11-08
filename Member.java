
package socialclub;

import java.util.ArrayList;
import java.util.HashSet;

public class Member {
    //definicion de atributos  para la clase socio
    public String id;
    public String name;
    public double funds;
    String subscriptionType;
    public ArrayList<Bill> bills = new ArrayList<>();
    HashSet<String> authorizedPersons;

    //creacion de constructor
    public Member(String id, String name, double funds, String subscriptionType) {
        this.id = id;
        this.name = name;
        this.funds = funds;
        this.subscriptionType = subscriptionType;
        this.bills = new ArrayList<> ();
        this.authorizedPersons = new HashSet<>();
    }

    // metodo para agregar a persona autorizada
    public void addAuthorizedPerson(String name) {
        if (authorizedPersons.size() < 10) {
            authorizedPersons.add(name);
        } else {
            System.out.println("No se pueden agregar más personas autorizadas.");
        }
    }
    
    // metodo para eliminar a persona autorizada
    public void deleteAuthorizedPerson(String name) {
        if (authorizedPersons.contains(name)) {
            authorizedPersons.remove(name);
        } else {
            System.out.println("La persona autorizada no existe.");
        }
    }
    
    // metodo para registrar consumo
    public void registerConsumption(String concept, double value, String nameMember) {
        if (funds >= value) {
            bills.add(new Bill(concept, value, nameMember));
            funds -= value;
        } else {
            System.out.println("Fondos insuficientes para registrar el consumo.");
        }
    }
    
    //metodo para pagar una factura
   public void payBill(Bill bill) {
        if (bills.contains(bill) && funds>= bill.getValue()) {
            bills.remove(bill);
            funds -= bill.getValue();
        } else {
            System.out.println("No se puede pagar esta factura.");
        }
    }
   
    // metodo para aumentar fondos
    public void increaseFunds(double amount) {
        double limitFunds = (subscriptionType.equals("VIP")) ? 5000000 : 1000000;
        if (funds + amount <= limitFunds) {
            funds += amount;
        } else {
            System.out.println("No se pueden aumentar más fondos.");
        }
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Nombre: " + name + ", Fondos: $" + funds + ", Tipo Suscripción: " + subscriptionType;
    }

    //metodos getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

}


