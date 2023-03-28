package esercizio;

import esercizio.cocktail.CocktailAlcolico;
import esercizio.cocktail.CocktailAnalcolico;

public class Main {
    public static void main(String[] args) {
        Bar bar = new Bar("BarBlu");

        //componente
        Componente com1 = new Componente("Acqua",89.1,1);
        Componente com2 = new Componente("Cannuccia",8.1,2);
        Componente com3 = new Componente("Bicchiere",19.1,3);
        Componente com4 = new Componente("Nonloso",1.4,6);

        //cocktail alcolici
        CocktailAlcolico ca1 = new CocktailAlcolico("Frescata",12);
        ca1.addComponent(com1);
        ca1.addComponent(com2);
        ca1.addComponent(com3);
        CocktailAlcolico ca2 = new CocktailAlcolico("Amara",32);
        ca2.addComponent(com1);
        ca2.addComponent(com2);
        ca2.addComponent(com4);

        //cocktail analcolici
        CocktailAnalcolico cAnalcolico1 = new CocktailAnalcolico("Frescata");
        cAnalcolico1.addComponent(com1);
        cAnalcolico1.addComponent(com4);
        cAnalcolico1.addComponent(com3);
        CocktailAnalcolico cAnalcolico2 = new CocktailAnalcolico("Amara");
        cAnalcolico2.addComponent(com1);
        cAnalcolico2.addComponent(com2);
        cAnalcolico2.addComponent(com3);
        bar.addCocktail("001", ca1);
        bar.addCocktail("002", ca2);
        bar.addCocktail("011", cAnalcolico2);
        bar.addCocktail("012", cAnalcolico1);
        //System.out.println("Prezzo ca1: " + ca1.price());
        //System.out.println("Lista cocktail sotto certa gradazione: \n" + bar.CocktailMinoriDi(128));
        //System.out.println(bar.ordinaPerComponente(com4));
        System.out.println(bar.CostoCocktailMaggioreDi(0));
    }
}