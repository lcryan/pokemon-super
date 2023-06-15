package src;

public class FirePokemon extends PokemonSuper {
    private int wins;
    private int losses;
    int fireTemperature;
    String fireSound;


    public FirePokemon(String name, String nameOfTrainer, int level, int healthPoints, int experiencePoints, String pokemonTalk, String favouriteFood, String defence, String attack, boolean beingAttacked, int wins, int losses, int fireTemperature, String fireSound) {
        super(name, nameOfTrainer, level, healthPoints, experiencePoints, pokemonTalk, favouriteFood, defence, attack, beingAttacked);
        this.wins = wins;
        this.losses = losses;
        this.fireTemperature = fireTemperature;
        this.fireSound = fireSound;
        this.pokemonTalk = pokemonTalk;
        this.favouriteFood = favouriteFood;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void fireLash() {
        if (fireTemperature > 150) {
            System.out.println("This is a win for " + name + "." + "The temperature of his fire lash was " + fireTemperature + "!");
        } else {
            System.out.println(name + "lost.Maybe it is best to take a rest now to charge the pokemon's fire power.");
        }
    }

    public void flameThrower() {
        System.out.println(name + "'s flame thrower sound is " + fireSound + " !");
    }

    @Override

    public void speaks() {
        System.out.println(name + " says " + pokemonTalk + ".");
    }

    public void eats() {
        System.out.println(name + " loves to eat " + favouriteFood + ".");
    }
}
