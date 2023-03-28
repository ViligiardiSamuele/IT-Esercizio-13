package esercizio.cocktail;

import esercizio.Componente;

import java.util.List;

public class CocktailAnalcolico extends Cocktail{

    public CocktailAnalcolico(String name, List<Componente> components) {
        super(name, components);
    }

    public CocktailAnalcolico(String name) {
        super(name);
    }
}
