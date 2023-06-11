package src;

public abstract class PokemonSuper {
    final String name;
    String nameOfTrainer;
    int level;
    private int healthPoints;
    private int experiencePoints;

    FirePokemon firePokemon;

    public FirePokemon getFirePokemon() {
        return firePokemon;
    }

    public void setFirePokemon(FirePokemon firePokemon) {
        this.firePokemon = firePokemon;
    }

    public PokemonSuper(String name, String nameOfTrainer, int level, int healthPoints, int experiencePoints) {
        this.name = name;
        this.nameOfTrainer = nameOfTrainer;
        this.level = level;
        this.healthPoints = healthPoints;
        this.experiencePoints = experiencePoints;
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

    public void speaks() {
        System.out.println("lala");
    }// can be overwritten ?? //

    public void eats() {
        System.out.println("nothing");
    }

    public void printOutPokemonInfo() {
        System.out.println(name + " is being trained by " + nameOfTrainer + "." + name + "'s level is " + level + "."
                + "The current health points are at " + healthPoints + "%" + " and the experience points are " + experiencePoints + ".");
    }
}
