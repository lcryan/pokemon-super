package src;

public class WaterPokemon extends PokemonSuper {
    private String secretWeapon;
    private String secretWeakness;


    public WaterPokemon(String name, String nameOfTrainer, int level, int healthPoints, int experiencePoints, String pokemonTalk, String favouriteFood, String defence, String attack, boolean beingAttacked, String secretWeapon, String secretWeakness) {
        super(name, nameOfTrainer, level, healthPoints, experiencePoints, pokemonTalk, favouriteFood, defence, attack, beingAttacked);
        this.secretWeapon = secretWeapon;
        this.secretWeakness = secretWeakness;
    }

    public String getSecretWeapon() {
        return secretWeapon;
    }

    public void setSecretWeapon(String secretWeapon) {
        this.secretWeapon = secretWeapon;
    }

    public String getSecretWeakness() {
        return secretWeakness;
    }

    public void setSecretWeakness(String secretWeakness) {
        this.secretWeakness = secretWeakness;
    }

    public void rainDance() {
        System.out.println(name + " needs more power!!! Let " + name + " make a raindance!!!");
    }

    public void hydroSecret() {
        System.out.println("Watch out!" + name + " is getting a " + secretWeapon + " ready !");
    }

    @Override
    public void fightStrategy() {
        if (beingAttacked) {
            System.out.println(name + " cannot remember his special attack method. You have to tell him to use " + secretWeapon + "!");
        } else {
            System.out.println(name + " will only put " + defence + " in place.");
        }
    }
}

