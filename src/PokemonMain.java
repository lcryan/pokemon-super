package src;

public class PokemonMain {

    public static void main(String[] args) {

        // 1. All calls from FirePokemon here:
        FirePokemon charmander = new FirePokemon("Charmander", "Damian", 349, 45, 780, "CHAR CHAR", "wildberries", "ring of fire", "fire first", true, 800, 900, 400, "Wheeeee");
        charmander.printOutPokemonInfo();
        charmander.fireLash();
        charmander.flameThrower();
        // override methods below:
        charmander.speaks();
        charmander.eats();

        //2. All calls for WaterPokemon here:

        WaterPokemon vaporeon = new WaterPokemon("Vaporeon", "Crystal", 800, 80, 350, "blub blub", "marshmellows", "water fountain", "water slime", true, "water canon 2000", "Pikachu's voice");
        vaporeon.printOutPokemonInfo();
        vaporeon.rainDance(); //method 1 of WaterPokemon;
        vaporeon.hydroSecret(); // method 2 of WaterPokemon
        vaporeon.fightStrategy();// override method //
        System.out.println(vaporeon.getSecretWeakness()); // extra call - not necessary for assignment //
        System.out.println(vaporeon.getSecretWeapon()); // extra call - not necessary for assignment //

        //3. All calls for GrassPokemon here :

        GrassPokemon oddish = new GrassPokemon("Oddish", "Jessebelle", 248, 55, 189, "ish ish", "gummy bears", "soil shell", "root whip", true, "Evee", "wakakuu");
        oddish.printOutPokemonInfo();
        oddish.callForHelp();
        oddish.namePokemonFriend();
        oddish.speaks();
        oddish.eats();
        oddish.fightStrategy();


        //4. All calls for ElectricPokemon here :

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", "Ash", 500, 300, 890, "pika pika", "ramen noodles", "boltage", "pika thunder", false, 3000, 190);
        pikachu.printOutPokemonInfo();
        pikachu.readyForCompetition();
        pikachu.voltageMeter();
        pikachu.speaks();
        pikachu.eats();
    }
}
