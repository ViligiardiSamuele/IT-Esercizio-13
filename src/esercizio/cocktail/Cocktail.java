package esercizio.cocktail;

import esercizio.Componente;

import java.util.ArrayList;
import java.util.List;

public class Cocktail implements Comparable<Cocktail>{
    protected String name;
    protected List<Componente> Components;

    public Cocktail(String name, List<Componente> components) {
        this.name = name;
        Components = components;
    }

    public Cocktail(String name) {
        this.name = name;
        Components = new ArrayList<>();
    }

    public Cocktail(Cocktail c) {
        name = c.name;
        Components = c.Components;
    }
    public String getName() {
        return name;
    }

    public List<Componente> getComponents() {
        return Components;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setComponents(List<Componente> components) {
        Components = components;
    }
    public Double getPrice(){
        double tot = 0;
        for(Componente c : Components)
            tot += c.getCost() * c.getQuantity();
        return tot;
    }

    public void addComponent(Componente c){
        if(!Components.contains(c))
            Components.add(c);
    }

    public void removeComponent(Componente c){
        Components.remove(c);
    }

    @Override
    public int compareTo(Cocktail o) {
        return (int)(this.getPrice() - o.getPrice());
    }

    public List<Componente> componentiConPrezzo(Cocktail c, double prezzo){
        List<Componente> lista = new ArrayList<>();
        for(Componente comp : c.getComponents()){
            if(comp.getCost() == prezzo)
                lista.add(comp);
        }
        return lista;
    }

    public boolean cocktailAlcolico(Cocktail c){
        return c instanceof CocktailAlcolico;
    }

    public String toString(){
        return "\nNome: " + this.getName() + " " + this.getComponents().toString();
    }
}