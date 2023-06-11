package src;

public class GrassPokemon extends PokemonSuper {

    private String friend;

    private String secretCall;


    public GrassPokemon(String name, String nameOfTrainer, int level, int healthPoints, int experiencePoints, String pokemonTalk, String favouriteFood, String defence, String attack, boolean beingAttacked, String friend, String secretCall) {
        super(name, nameOfTrainer, level, healthPoints, experiencePoints, pokemonTalk, favouriteFood, defence, attack, beingAttacked);
        this.friend = friend;
        this.secretCall = secretCall;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String getSecretCall() {
        return secretCall;
    }

    public void setSecretCall(String secretCall) {
        this.secretCall = secretCall;
    }

    public void callForHelp() {
        if (beingAttacked) {
            System.out.println(name + " has to call " + friend + "." + name + " uses the secret call " + secretCall + ".");
        } else {
            System.out.println("Everything is quite right now. No need to call your friend " + name + ".");
        }
    }

    public void namePokemonFriend() {
        System.out.println(name + "'s friend is " + friend + ".");
    }

// here Override from SuperPokemon

    @Override
    public void speaks() {
        System.out.println(name + "'s sound is " + pokemonTalk + ".");
    }

    public void eats() {
        System.out.println(name + "'s absolute favourite food is " + favouriteFood + "!");
    }
}
