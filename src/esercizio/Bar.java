package esercizio;

import esercizio.cocktail.Cocktail;
import esercizio.cocktail.CocktailAlcolico;
import esercizio.cocktail.CocktailAnalcolico;
import esercizio.cocktail.comparators.CocktailNameComparator;
import esercizio.cocktail.comparators.CocktailPrezzoComparator;

import java.util.*;

public class Bar {
    protected String name;
    protected HashMap<String, Cocktail> bar;

    public Bar(String name, HashMap<String, Cocktail> bar) {
        this.name = name;
        this.bar = bar;
    }
    public Bar(String name) {
        this.name = name;
        this.bar = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Cocktail> getBar() {
        return bar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBar(HashMap<String, Cocktail> bar) {
        this.bar = bar;
    }

    public void addCocktail(String code, Cocktail c){
        if(!bar.containsKey(code))
            bar.put(code,c);
    }
    public void removeCocktail(String code){
        bar.remove(code);
    }
    public double getPrice (Cocktail c){
        double tot = c.getPrice();
        if(c instanceof CocktailAlcolico)
            tot += ((CocktailAlcolico) c).getGrad() * CocktailAlcolico.FATTORE_COSTANTE;
        return tot;
    }

    public ArrayList<CocktailAlcolico> CocktailMinoriDi(double grade){
        ArrayList<CocktailAlcolico> list = new ArrayList<>();
        for(Cocktail c : new ArrayList<>(bar.values()))
            if(c instanceof CocktailAlcolico a)
                if(a.getGrad() < grade)
                    list.add(a);
        return list;
    }

    public List<Cocktail> ordinaPerComponente(Componente c){
        List<Cocktail> out = new ArrayList<>();
        for(Cocktail cocktail : bar.values())
            if (cocktail.getComponents().contains(c)){
                out.add(cocktail);
            }
        Collections.sort(out);
        return out;
    }

    public ArrayList<Cocktail> CostoCocktailMaggioreDi(double cost){
        ArrayList<Cocktail> list = new ArrayList<>();
        for(Cocktail c : new ArrayList<>(bar.values()))
            if(c.getPrice() > cost)
                list.add(c);
        list.sort(new CocktailPrezzoComparator());
        return list;
    }

    public ArrayList<CocktailAlcolico> componenteComune(Componente c){
        ArrayList<CocktailAlcolico> lista = new ArrayList<>();
        for(Cocktail cocktail : new ArrayList<>(bar.values())){
            if(cocktail instanceof CocktailAlcolico ca){
                if(ca.getComponents().contains(c))
                    lista.add(ca);
            }
        }
        lista.sort(new CocktailNameComparator());
        return lista;
    }

    public double valoreComplessivoCocktail(){
        double tot = 0;
        for(Cocktail c : new ArrayList<>(bar.values()))
            tot += c.getPrice();
        return tot;
    }

    public int numeroCocktailAlcolici(){
        int tot = 0;
        for(Cocktail c : new ArrayList<>(bar.values()))
            if(c instanceof CocktailAlcolico) tot++;
        return tot;
    }

    public int numeroCocktailAnalcolici(){
        int tot = 0;
        for(Cocktail c : new ArrayList<>(bar.values()))
            if(c instanceof CocktailAnalcolico) tot++;
        return tot;
    }
}