package src;

public class PokemonMain {

    public static void main(String[] args) {
        // 1. All calls from FirePokemon here:
        FirePokemon charmander = new FirePokemon("Charmander", "Damian", 15, 25, 300, 200, 140, 380, "WHHOOOSSHHH", "CHAR CHAR", "fish");
        charmander.printOutPokemonInfo();
        charmander.fireLash();
        charmander.flameThrower();
        // Here the SuperPokemon override - calls:
        charmander.speaks();
        charmander.eats();
//2. All calls for WaterPokemon here:
        WaterPokemon vaporeon = new WaterPokemon();


    }
}
