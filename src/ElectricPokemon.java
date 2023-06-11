package src;

public class ElectricPokemon extends PokemonSuper {
    private int volt;
    private int age;

    public ElectricPokemon(String name, String nameOfTrainer, int level, int healthPoints, int experiencePoints, String pokemonTalk, String favouriteFood, String defence, String attack, boolean beingAttacked, int volt, int age) {
        super(name, nameOfTrainer, level, healthPoints, experiencePoints, pokemonTalk, favouriteFood, defence, attack, beingAttacked);
        this.volt = volt;
        this.age = age;
    }

    public int getVolt() {
        return volt;
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void readyForCompetition() {
        if (age > 40) {
            System.out.println("Sorry, but " + name + " is too old. You are not allowed to compete.");
        } else if (age < 10) {
            System.out.println("Your pokemon is too young." + name + " cannot compete today.");
        } else {
            System.out.println("Get " + name + " ready to compete! It's on!");
        }
    }

    public void voltageMeter() {
        System.out.println(name + "'s " + attack + " was " + volt + " volt strong.");
    }

    @Override
    public void speaks() {
        System.out.println(name + " says " + pokemonTalk + ".");
    }

    public void eats() {
        System.out.println(name + "'s favourite food is " + favouriteFood + ".");
    }
}


