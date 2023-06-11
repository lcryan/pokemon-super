package src;

public class PokemonMain {

    public static void main(String[] args) {
        // 1. All calls from FirePokemon here:
        FirePokemon charmander = new FirePokemon("Charmander", "Damian", 349, 45, 780, "CHAR CHAR", "wildberries", "ring of fire", "fire first", true, 800, 900, 400, "Wheeeee");
        charmander.printOutPokemonInfo();
        charmander.fireLash();
        charmander.flameThrower();
        charmander.speaks();
        charmander.eats();
        // Here the calls of the override methods:
//2. All calls for WaterPokemon here:

        WaterPokemon vaporeon = new WaterPokemon("Vaporeon", "Crystal", 800, 80, 350, "blub blub", "marshmellows", "water fountain", "water slime", true, "water canon 2000", "Pikachu's voice");
        vaporeon.printOutPokemonInfo();
        vaporeon.rainDance();
        vaporeon.hydroSecret();
        vaporeon.fightStrategy();// something is wrong here //
        System.out.println(vaporeon.getSecretWeakness());
        System.out.println(vaporeon.getSecretWeapon());
    }
}
