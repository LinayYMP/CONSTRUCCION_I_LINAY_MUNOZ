
package socialclub;

public class Bill {
    //definicion de atributos para la clase factura
    private String concept;
    private double value;
    private String nameMember;

    //creacion de constructor
    public Bill(String concept, double value, String nameMember) {
        this.concept = concept;
        this.value = value;
        this.nameMember = nameMember;
    }
    
    // metodos getter y setter
    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getNameMember() {
        return nameMember;
    }

    public void setNameMember(String nameMember) {
        this.nameMember = nameMember;
    }
}
    
    
 
