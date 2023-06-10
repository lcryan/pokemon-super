package src;

public class PokemonMain {

    public static void main(String[] args) {
        FirePokemon Charmander = new FirePokemon("Charmander", "Ash", 450, 800, 240, 10, 15, 380, "Whoosh");
        System.out.println(Charmander.getLosses());
        System.out.println(Charmander.fireTemperature);
        Charmander.fireLash();
    }
}
