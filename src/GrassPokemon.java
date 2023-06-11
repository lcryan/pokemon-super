package src;

public class GrassPokemon extends PokemonSuper {

    private String callFriend;

    private String secretCall;


    public GrassPokemon(String name, String nameOfTrainer, int level, int healthPoints, int experiencePoints, String pokemonTalk, String favouriteFood, String defence, String attack, boolean beingAttacked, String callFriend, String secretCall) {
        super(name, nameOfTrainer, level, healthPoints, experiencePoints, pokemonTalk, favouriteFood, defence, attack, beingAttacked);
        this.callFriend = callFriend;
        this.secretCall = secretCall;
    }

    public String getCallFriend() {
        return callFriend;
    }

    public void setCallFriend(String callFriend) {
        this.callFriend = callFriend;
    }

    public String getSecretCall() {
        return secretCall;
    }

    public void setSecretCall(String secretCall) {
        this.secretCall = secretCall;
    }

    public void callForHelp() {
if(beingAttacked) {
    System.out.println(name + " has to call " + );
}
    }

}
