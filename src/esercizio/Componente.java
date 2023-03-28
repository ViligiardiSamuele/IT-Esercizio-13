package esercizio;

public class Componente{
    protected String name;
    protected double cost, quantity;

    public Componente(String name, double cost, double quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return "\nNome: " + this.getName() + " - Costo: " + this.getCost() + " - Quantita': " + this.getQuantity();
    }
}
