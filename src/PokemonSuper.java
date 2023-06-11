package src;

public abstract class PokemonSuper {
    final String name;
    String nameOfTrainer;
    int level;
    private int healthPoints;
    private int experiencePoints;

    String pokemonTalk;
    String favouriteFood;
    String defence;
    String attack;

/*
    name, nameOfTrainer, level, healthPoints, experiencePoints, defence, attack, pokemonTalk, favouriteFood, beingAttacked
*/


    boolean beingAttacked;

    FirePokemon firePokemon;

    public FirePokemon getFirePokemon() {
        return firePokemon;
    }

    public void setFirePokemon(FirePokemon firePokemon) {
        this.firePokemon = firePokemon;
    }

    public PokemonSuper(String name, String nameOfTrainer, int level, int healthPoints, int experiencePoints, String pokemonTalk, String favouriteFood, String defence, String attack, boolean beingAttacked) {
        this.name = name;
        this.nameOfTrainer = nameOfTrainer;
        this.level = level;
        this.healthPoints = healthPoints;
        this.experiencePoints = experiencePoints;
        this.pokemonTalk = pokemonTalk;
        this.favouriteFood = favouriteFood;
        this.defence = defence;
        this.attack = attack;
        this.beingAttacked = beingAttacked;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public String getPokemonTalk() {
        return pokemonTalk;
    }

    public void setPokemonTalk(String pokemonTalk) {
        this.pokemonTalk = pokemonTalk;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public void speaks() {
        System.out.println();
    }

    public void eats() {
        System.out.println();
    }


    public void fightStrategy() {
        if (beingAttacked) {
            System.out.println(name + " will defend his friends with " + attack + ".");
        } else {
            System.out.println("All is quiet now, but it's always good to have your " + defence + " up.");
        }
    }

    public void printOutPokemonInfo() {
        System.out.println(name + " is being trained by " + nameOfTrainer + "." + name + "'s level is " + level + "."
                + "The current health points are at " + healthPoints + "%" + " and the experience points are " + experiencePoints + ".");
    }
}
